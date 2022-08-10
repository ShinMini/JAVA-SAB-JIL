package view;

import model.domain.Customer;

public class SuccessView {

	public static void print(Customer c) {
		System.out.println("고객 정보 " + c.getId() + " " + c.getGrade());
	}
}
