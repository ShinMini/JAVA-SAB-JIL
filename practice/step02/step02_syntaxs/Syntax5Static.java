package step02_syntaxs;

public class Syntax5Static {
	static {
		System.out.println(3);
	}
	static {
		System.out.println(1);
	}
	static {
		System.out.println(2);
	}

	public static void main(String[] args) {
		System.out.println("main function running");

	}

}
