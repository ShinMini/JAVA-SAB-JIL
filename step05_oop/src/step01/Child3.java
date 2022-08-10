package step01;

public class OOPTest {

   static Object m1() { // Object 변수 = "객체 형변환"; 다형성 적용, 상위타빙ㅂ으로 변환되어 반환
      return "객체 형변환";
   }

   static void m2(Object v) {
      String s = (String) v;
      System.out.println(s.length()); // String 클래스에만 있는 length메소드를 사용하기 위해 String class로 변환
   }

   static void m3(String v) {
      System.out.println(v.length()); // String 클래스에만 있는 length메소드를 사용하기 위해 String class로 변환
   }

   public static void main(String args[]) {
      // m1()을 반드시 argument로 적용한다면 how to edit 23 line code?
      m3((String) m1());
      // order of call functions : 1. m1() -> 2. casting(String) -> 3. m3()

      m2(m1());

      /*
       * 
       * String s = (STring)m1();
       * String s 라는 변수가 메모리에 생성
       * 
       */
   }
}