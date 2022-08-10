package step01;

class Parent2 extends Object {
   String id;
   int pw;

   public Parent2 { 
      super();
   }

   String getDate(){
      return id + " " + pw;
   }
}

public class Child2 extends Parent2 {
   String name;

   public Child2(){
      super();
   }

   // ? 재정의
   // 부모 메소드의 모든 로직 그대로 반영하는 콛 super.methodName([...]);
   // 메소드 선언구가 동일해야함.
   // job 포함
   String getData() {
      return super.getDate() + "이름" + name;
   }

   public static void main(String[] args) {
      Child2 c = new Child2();
      System.out.println(c.getData());
      System.err.println(c); // step01.Child2@1235abe -> 주소값

      String i = "encore";
      System.out.println(i); // i.toString()

      Integer i2 = new Integer("3");
      System.out.println(i2); // i2.toString()
   }
}