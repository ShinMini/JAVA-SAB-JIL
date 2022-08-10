package step02;

import org.junit.Test;

public class Syntax6Array {

	@Test
	public void intArray() {
	
		int[] i= new int[2]; // int값 두개 저장 가능한 int array create
		i[0] = 10;
		i[1] = 20;
		System.out.println(i[0]);
		System.out.println(i.length);
	}
	
	// declare creation initialization one sentence
	@Test
	public void intArray2() {
		// {} 표현만으로 객체 생성
		int [] i = {1,2,3};	
		System.out.println(i[0]);
		System.out.println(i.length);
		
		int i2 = 0;
		System.out.println(i2);
		
		int [] i3 = new int[5];
		System.out.println(i3[2]);
	}
	
	
}

/*
 * java 변수 선언 위치에 따른 구분
 * 1. 맴버변수
 * 		- class {} 내부에 선언되는 변수
 * -	- heap에 저장, 기본적으로 자동 초기화
 * 1. instance 변수
 * 	- 객체 생성 후에만 사용 가능한 변수
 * 2. static 변수
 * 	- 객체 생성 여부와 무관하게 사용한 변수
 * 
 * 2. 로컬 변수
 * 	- 생성자, 메소드() or {} 선언되는 변수 
 * 	- 생성되는 시점은 생성자, 메소드 호출시 생성 및 종료 시 자동 메모리에서 소멸
 * 	- 자동 초기화 되지않음.
 */

