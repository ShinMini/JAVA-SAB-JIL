package step01;

class Parent extends Object { // 하나의 class에는 public class가 하나밖에 올 수 없음. 명시적으로 Object를 상속하지 않아도 자동으로 상속한다.
   String name;
   int age;

   Parent() { // 이 또한 명시적으로 선언하지않아도, 자동으로 선언됨.
      super(); // 부모의 기본 생성자 호출
      System.out.println("부모");
   }

   void print() {
      System.out.println(name);
      System.out.println(age);
   }

}

// 상위타입 객체에 자식객체를 상속할 수있음 -> Parent p = new Child();  //name, age, job 메모리 생성.
public class Child extends Parent {
   String job;

   void print() {
      super.print();
      System.out.println(job);
   }

   public static void main(String[] args) {

   }
}