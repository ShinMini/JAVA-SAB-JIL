package step03.app;

import org.junit.Test;

public class ArrayTest {
	static int[] m1(){
//		int [] i = new int[2];
//		i[0] = 10;
//		i[1] = 20;
		int i[] = {1,2,3,4,5,6,7,8,9,10};

		return i;
	}
	
	static void m2(int [] i) {
		System.out.println(i[0]);
		System.out.println(i.length);

		System.out.println("array data print using loop sentence");
		
		for(int v: i) {
			System.out.println(v);
		}
	}
	
	@Test
	public static void stringArray() {
		String [] s = {"a", "b" , "c"};
		for(String v : s) {
			System.out.println(v);
		}
	}
	
	public static void main(String args[]) {
		m2(m1());
		stringArray();
	}
}