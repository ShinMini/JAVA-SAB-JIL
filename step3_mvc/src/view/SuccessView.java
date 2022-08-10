package view;

import model.domain.Student;

// StartView -> Controller -> Model : Student & Subject -> Controller -> SuccessView or FailView
public class SuccessView {
   // print searched student's profile
   public static void printStudent(Student stu) {
      System.out.println("serached student's info: " + stu.getName() + " " + stu.getGrade());
   }

   public static void printTeacherName(String string) {
   }
}