package step01;

import org.junit.Test;

class A {
   String name = "playdata";
   A(){System.out.println("A객체 실행");}
}

class B {
   A a = new A();
   B(){ System.out.println("B객체 실행"); }
}

class C {
   B b = new B();
   C(){System.out.println("C객체 실행");}
}

public class App {

   @Test
   public void test() {
      C c = new C(); // 더 이상의 객체 생성 금지
      // ? A의 name variable print
      // ? print To list the order of object creation
      System.out.println(c.b.a.name);
      System.out.println(c.b.a.name.charAt(0));
      System.out.println(c.b.a.name.length());

   }

}
