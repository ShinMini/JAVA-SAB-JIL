1. 상속이란? 
   - programing에서 상속이란 무엇일까?
   - What is inheritance in programming?

## Class 형변환을 도대체 왜 씀? -> 어따씀?

1. 특정 method의 반환값 또는 parameter로 지정된 Object type을 맞춰 method or fucntion을 실행시키기 위해. 
ex) -> 야 나 이거줘, ? ㅇㅋ ㄱㄷ 바로 포장 -> 자 여기. 
/*
 * java instanceOf 사용방법
 * 
 * 1. 객체 타입 비교 연산자: instanceof
 * 
 * 2. 단 상속 관계끼리의 타입간에만 비교
 * 
 * 3. 주의사항
 * 상위 타입의 변수로 생성된 하위 객체들은(다형성 적용) 상위타입의 상속 관계 하위 타입들과 비교 가능
 * B b = new B() 처럼 타입과 객체가 일치된 경우엔 상위 타입 이외엔 다른 타입과 비교 불가
 * 
 */
 public boolean equals(Object o){ //o는 Customer 자식만의 id/pw는 unaccessable}
 if(o instanceof Customer){
	Customer c = (Customer)o;

	if( id.equals(c.getId()) && pw == c.getPw() ) {
		return true;
	}else {
		return false;
	}
	else{
		return false;
	}
}

### Data structure of java objects
1. List
2. 2. 