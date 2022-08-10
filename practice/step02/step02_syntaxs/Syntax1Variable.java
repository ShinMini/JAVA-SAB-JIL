package step02_syntaxs;

public class Syntax1Variable {
	int no1;
	int no2;
	boolean b;
	float f;
	char c = '가';	// 명시적인 초기화
	

	void m1() {
		int no1 = 10;	// 로컬 변수는 초기화하지 않은 상태로 사용 불가. 
		System.out.println(no1);
	}

	public static void main(String[] args) {
		// no1, no2, m1() 실행을 위해서 객체 생성 필수
		// s1이라는 참조 변수가 참조하는 syntax1Variable instance(객체)
		Syntax1Variable s1 = new Syntax1Variable();	// 생성자는 우선순위가 높아, 코드 하단부에 선언하고, 상단부에서 호출할 수 있다. 
		System.out.println(s1);	// step02.Syntax1Variable@1cdkfj => 해당 위치의 디렉터리와 주소값 반환
		System.out.println(s1.no1);	// 0
		System.out.println(s1.b);	// false
		System.out.println(s1.f);	// 0.0
		System.out.println(s1.c);	// '가'
		

	}

}
