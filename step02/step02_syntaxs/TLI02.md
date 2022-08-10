학습 내용

1. 변수
	1. 멤버 변수
		1. class {} 내부에 선언
		2. 객체 생성시에 heap에 생성
		3. 각 타입별 자동 초기화
		4. 객체 참조 변수로 호출 가능
		5. 생성자가 호출되서 실행될때 자동 메모리 생성
		6. 종류
			1. instance 변수
				- 객체 생성 필수
				- 참조 변수로 호출 필수
			2. static 변수
				- 객체 생성 옵션
				- 참조 변수로 호출도 가능 / class명으로 호출 / 동일한 클래스내에선 변수명만으로 호출 
		
		
	2. 로컬 변수
		1. 메소드 () 또는 {} 내부에 선언
		2. 사용전 초기화 필수
			멤버 변수와 달리 자동 초기화되지 않음
		3. 저장되는 메모리는 stack
		4. 메소드 호출시에만 생성, 종료시 자동 삭제
		5. automatic, temporary, stack
		

2. 생성자
	1. 필수 구성 요소
		- 개발자가 코딩하지 않을 경우에도 자동 생성
		- 필요에 의해 개발자가 여러 생성자 개발 가능
			단, parameter 는 달라야 함
			- 오버로딩
	2. 객체 생성시에 호출되는 문법
	3. 문법
		1. class명과 100% 동일
		2. 반환 영역 자체가 없다
	4. 기능
		- 객체 생성이 주목적
		
	5. 생성 문법
		new 생성자([..]);
		
		
3. static 키워드
	1. 변수
		- static 변수
		- 객체 생성 유무와 무관하게 호출 가능
		- 저장되는 위치는 byte code가 로딩되는 method or class area에 저장
		- 호출 방식	
			class명 호출, 변수, 참조변수로 호출
		- 단, *** 생성되는 모든 객체가 유일하게 공유하는 자원
		
	2. 메소드
		- 해당 메소드가 포함된 클래스의 객체 생성이 중요하지 않은 상태로
		메소드 기능만 독립적으로 호출 가능한 경우 static 권장
		
		- java.lang.Math의 모든 메소드는 Math 객체를 필요로 하지 않음
			: python과 js는 함수 문법 지원
			java 에선 모든 메소드는 class내에 포함되어야 하는 rule
			static으로 구성된 메소드들을 로직에 적합한 클래스명으로 관리

4. builder & MVC pattern
	- 

- maven / @Test 	

======
키워드
- 이미 정해진 기능이 있는 단어들
- 그 기능 이외 사용 불가
- 클래스명, 변수명, 메소드명 등으로 사용 불가 

1. new
	- 객체 생성시에만 생성자와 조합

2. private : 외부 클래스에서 호출 불가

3. public : 외부 클래스에서 호출 가능

4. class : 자바 소스 선언구에 class 선언

5. int / float/ boolean / char 
	- 정수, 실수, 논리, 문자형 등 표현 
6. void
	- 메소드 반환 타입이 없음
7. return
	- 메소드 body 마지막에 반환값 제공 
8. if
	- 조건문장 의미

9. package: 클래스를 package 로 묶음 의미

10. import : 외부 package 사용 의미


=======

# static{}

* feature
	* 이름이 없음. 
		* no name 
	* 코드로 직접적인 호출 방법이 없음. 
		* no way to call function in code directly. 
	* 실행 시점
		* byte code가 로딩시 자동 실행
			- auto run when byte code is loaded .
	* 주용도
		* 모든 user들이 공유하는 자원 단 한번만 초기화시에 주로 사용
			- Resources shared by all users are mainly used for initialization only once
		* 서버가 시작할때 단 한번만 로딩해야 하는 초기자원 설정시 주로 사용. 
			- Mainly used to set up initial resources that must be loaded only once when the server starts.