/* 학습 내용
 * 
 *  - static method & API
 *  - static method & API
 */
package step02_syntaxs;

public class Syntax4Static {
	static String data = "playdata";

		//? data 변수가 참조하는 갳체의 길이값 출력. // ? p 만 뽑아서 출력. 
	static void print_str_length(String input_str) {
		System.out.println(input_str.length());
	}

	// task 1
	static void find_char(char find_char, String input_str) {
		try {
			int str_index_num = input_str.indexOf(find_char);
			System.out.format("%d번째인덱스에 \'" + data.charAt(str_index_num) + "\'이(가) 포함되어있습니다.", str_index_num);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	// task2
	public static void compare_nums(int num1, int num2) {
		// ? 2, 3 두개의 숫자값 비교해서 최대값 출력. 
		System.out.println(Math.max(num1, num2));
	}

	// ? 0.0 <= 난수값 < 1.0 까지의 실수(double)값 출력. 
	public static void print_ran_num() {
		System.out.println(Math.random());       // 0 ~ 1.0
	}
	
	// task 3 
	// java.lang.Intger
	//? "" 제거 후 int 변환 가능한 문자열에 한해서만 int로 변경
	// int로 변경불가능한 "삼"등으로 값을 주면 어떤일 발생되어 할까요. 
	public static void m3() {
		int v = Integer.parseInt("3");
		
	}

	public static void main(String[] args) {
		// run task1
		print_str_length(data); 
		find_char('i', data);

		// run task2
		compare_nums(2, 3);
		print_ran_num();
	}

}
