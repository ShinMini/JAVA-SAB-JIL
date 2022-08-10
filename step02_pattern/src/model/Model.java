/* 차후 실제 db와 연동되는 핵심. 
 * 
 */
package model;


import model.domain.Customer;

public class Model {
	private Long a;
	private String b;
	private int d;
	
	private Customer c = new Customer("id01", 20, "vvip", 'F');

	// id로 고객 검색 즉 고객정보 제공해주는 메소드
	public Customer select(String id){
		// id값을 사용한, 비교 검증 로직이 있다 가정. 
		
		return c;
	}
	
	// id를 기준으로 grade값을 변경하는 메소드
	public boolean update(String id, String newGrade){
		// 만일 미 존재하는 id로 수정 요청시 false 반환이라 가정. 
		// 조건 비교 코드 있다 가정. 
		c.setGrade(newGrade);
		return true;
	}
}
