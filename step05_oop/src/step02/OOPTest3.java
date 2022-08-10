package step02;

class A {
}

class B extends A {
}

class D extends A {
}
/*
 * java instanceOf 사용방법
 * 
 * 1. 객체 타입 비교 연산자: instanceof
 * 
 * 2. 단 상속 관계끼리의 타입간에만 비교
 * 
 * 3. 주의사항
 * 상위 타입의 변수로 생성된 하위 객체들은(다형성 적용) 상위타입의 상속 관계 하위 타입들과 비교 가능
 * B b = new B() 처럼 타입과 객체가 일치된 경우엔 상위 타입 이외엔 다른 타입과 비교 불가
 * 
 */

public class OOPTest3 {
   public static void main(String[] args) throws Exception {
      System.out.println("step01 --- ");
      A a = new A();
      B b = new B();
      D d = new D();

      System.out.println(a == b); // flase
      System.out.println(a instanceof A); // true a가 참조하는 타입이 A type이 맞는지 확인
      System.out.println(a instanceof Object);// true a가 참조하는 타입이 Object type이 맞는지 확인
      System.out.println(a instanceof B);// true a가 참조하는 타입이 B type이 맞는지 확인

      // 상속관계가 아닌 타입간에는 비교 자체가 금지.
      // System.out.println(b instanceof D); // 에러발생

      System.out.println("step02 --- 다형성 적용");
      Object a2 = new A(); // Object -> A
      A b2 = new B();// Object -> A -> B
      A d2 = new D(); // Object -> A -> D

      // 아래 부분이 true인 이유 -> A type(상위)의 변수로 선언된 후 생성된 하위 타입의 객체들은
      // A를 상속받는 타입간에도 비교 가능.
      System.out.println(b2 instanceof D); // true
      System.out.println(d2 instanceof B); // true

      System.out.println(a2 instanceof Object); // true
      System.out.println(b2 instanceof Object); // true
      System.out.println(d2 instanceof Object); // true

      System.out.println(b2 instanceof A); // true
      System.out.println(d2 instanceof A); // true

      System.out.println("step03 --- 다형성 적용");
      Object a3 = new A(); // Object -> A

   }

   return (o instanceof Customer) ? ()->{ (id.equals(Customer.getId) && pw == Customer.getPw) ? 1 : 0; } : 0;

/*
  try
  {
  Customer c = (Customer)o
  }catch(
  Exception e)
  {
  System.out.print(e);
  return false;
  }try(
  
  }else return false;(if):Customer}
 */