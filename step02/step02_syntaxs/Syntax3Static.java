/* 학습내용
 * 1. static 키워드.
 * 2. 적용 문법
 * 		1. 변수
 * 		2. 메소드
 * 		3. static{}
 * 
 * 3. 주용도
 * 		1. 클래스의 맴버 변수와 메소드 호출시 객체 생성 후 참조 변수로 호출이 기본
 * 		2. static으로 선언된 맴버 변수와 메소드 호출시에만 객체 생성없이 클래스명으로 호출 가능. 
 * 
 * 1. 변수
 * 		static type 변수명 [=값];
 * 		특징
 * 			1. 호출문법
 * 				class명.변수명
 * 					- 외부 클래스의 static 변수 호출 방법
 * 				변수명
 * 					- 동일한 클래스의 static 변수 호출 방법
 * 				변수명
 * 					- 참조변수가 이미 있다면 허용되는 문법
 * 			2. 생성되는 모든 객체가 공유하는 데이터.
 * 				- 주의사항 : pw나 id등의 변수는 절대 static으로 선언 불가. 
 * 			3. 실제 사용 가능하게 메모리에 생성되는 시점은 byte code가 적재(로딩)시 자동 생성. 
 */

package step02_syntaxs;

public class Syntax3Static {
	int no1;		// 객체(isntance) 생성 필수, instance 변수
	static int no2;	// byte code가 로딩될 때 32bit 메모리 생성 및 자동 초기화. 정적메모리, 전역 변수. 

	Syntax3Static(){
		no1++;
		no2++;
	}
	void m1() {	// 객체 생성 후 참조 변수로만 호출 가능한 메소드. 
		System.out.println("일반 메소드");
	}

	static void m2() {	// 객체 생성없이 클래스명으로만 호출 가능한 메소드. 
		System.out.println("static 메소드");
	}

	public static void main(String[] args) {

		System.out.println(no2);	// 0
		Syntax3Static Syn3con_1 = new Syntax3Static(); // 생성자 생성 동시에 constructor 호출.  no1변수를 heap 메모리에 생성 
		System.out.println(Syn3con_1.no1);
		System.out.println(no2);
		
		Syntax3Static Syn3con_2 = new Syntax3Static();
		System.out.println(Syn3con_2.no1);
		System.out.println(no2);

		Syn3con_1.m1();
		m2();
	}
}
