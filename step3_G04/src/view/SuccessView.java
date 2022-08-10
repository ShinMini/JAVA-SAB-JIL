package view;

import model.domain.Customer;
import model.domain.Product;

// StartView -> Controller -> Model : Student & Subject -> Controller -> SuccessView or FailView
public class SuccessView {
   // print searched student's profile
   public static void printCustomer(Customer customer) {
      System.out.println("serached customer's info: " + customer.getName() + " " + customer.getGrade());
   }

   public static void printProductInfo(Product product) {
	   System.out.println("serached product's info: " + product.getProduct_name() + " " + product.getCounts());
   }
}