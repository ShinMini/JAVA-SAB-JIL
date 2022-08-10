package view;

import model.domain.Customer;

// StartView -> Controller -> Model : Student & Subject -> Controller -> SuccessView or FailView
public class FailView {
   // print searched student's profile
   public static void printMsg(String msg) {
      System.out.println("error : " + msg);
   }

}