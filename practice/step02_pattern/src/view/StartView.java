package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		Controller c = new Controller();
		System.out.println("고객정보 검색 *****");
		c.reqRes(1); // 고객 검색
		
		System.out.println("고객정보 정보 수정 및 검색 *****");
		c.reqRes(2); // 고객 등급 수정. 
		c.reqRes(1); 

		System.out.println("무효한 검색 요청 *****");
		c.reqRes(3); 
	}
}
