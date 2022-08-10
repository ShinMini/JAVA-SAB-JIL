/* 학생, 과목 적옵를 활용하게 되는 핵심 클래스
* 차후에 db에 실제 직접 연동
* sql 문장 처리하는 클래스 

* 서비스 로직? crud
* 학생 정보 저장/ 과목 정보 저장. 
   이름으로 학생 한명의 모든 정보 검색이라 가정
         - select * from students where name =?
   과목으로 해당 과목의 강사이름만 검색이라 가정
      -select teacher_name from subject wehre subject_name=?
*/
package model;

import model.domain.Customer;
import model.domain.Product;

public class Model {
   private static Model instance = new Model();
   private Model() {}

   private static Customer[] Customers = new Customer[3];
   private static Product[] Products = new Product[3];
   
   // Model.class가 메모리에 로딩시 단 한번 실행되는 독특한 문법
   // 공유자원 초기화 권장 - test 데이터를 구성
   static { // 초기화 값 대입 - Student 변수와 Subject 변수는 memeber
      Customers[0] = Customer.builder().name("맹구").grade(3).build();
      Customers[1] = Customer.builder().name("철수").grade(3).build();
      Customers[2] = Customer.builder().name("짱구").grade(3).build();
      
      Products[0] = Product.builder().product_name("로션").counts(33).build();
      Products[1] = Product.builder().product_name("컴퓨터").counts(44).build();
      Products[2] = Product.builder().product_name("물컵").counts(55).build();
   }

   public static Model getInstance() {
	      return instance;
   }
   
   // select * from students where name=?
   public Customer queryCustomer(String name) {
	  for(int i =0; i<3; i++) {
		  if(Customers[i].getName() == name) {
			  return Customers[i];
		  }  
	  }
	  return Customer.builder().name("error").grade(0).build();
   }
   public Product queryProduct(String product_name) {
	  for(int i=0; i<3; i++) {
		  if(Products[i].getProduct_name() == product_name) {
			  return Products[i];
		  }
	  }
	   
      return Product.builder().product_name("error").counts(0).build();
   }


}