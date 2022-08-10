package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Customer {
	private String id;
	private int age;
	private String grade;
	private char gender; // identify sex / f-> female, m -> male

	public Customer(String id, int age, String grade, char gender) {
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// @Test
	// public void run(){
	// 기본 생성자로 호출해서 객체 생성
	// Customer c1 = new Customer();
	// c1.setId("id01");

	/*
	 * CustomerBuilder: 데이터 선별해서 맴버변수 초기화 가능하게 해주는 주체
	 * Customer라는 객체를 생성하는 API
	 * 
	 * @Builder로 인해 자동 생성
	 * 해당 class가 보유하는 composition.
	 * Customer의 모든 맴버 변수와 변수명과 동일한 메소드 자동 생성.
	 * 
	 * 활용 문법
	 * Customer.builder() 변환 CustomerBuilder
	 * id() 반환 타입 CustomerBuilder
	 */

}