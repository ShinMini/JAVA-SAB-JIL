package step02;

import model.domain.Subject;

public class OOPTest2 {
   static Object m1() {
      return new Subject("체육, "연아");
   }

   public static void main(String[] args) {
      Object s1 = m1();

      // 강사명 출력
      System.out.println( ((Subject)s1).getTeacherName() );

      Subject s2 = (Subject) m1();

      // 강사명 출력
      System.out.println(s2.getTeacherName());
   }

}
