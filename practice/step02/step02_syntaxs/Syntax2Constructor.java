/*
 * 다중정의 constructor
 * 하나의 클래스에서 메소드끼리, 생성자끼리에 적용되는 메카니즘
 * 이름 동일 단 parameter가 다름
 * 사용자가 편리하게 해주는 support
  */
package step02_syntaxs;

public class Syntax2Constructor extends Object{
		int no1;
		int no2;
		float f;
		boolean b;
		char c = '가';

	public static void main(String[] args) {
		Syntax2Constructor s = new Syntax2Constructor();
		System.out.println(s);

	}

}
