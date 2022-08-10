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

import model.domain.Student;
import model.domain.Subject;

public class Model {

   // static 에서 값 대입(initialized), use data in methods
   // private Student stu01; // 객체 생성 직후에만 사용 가능한 변수.
   private static Student stu01;
   private static Subject sub01;
   
   private static Model instance = new Model();
   private Model() {}

   
   // Model.class가 메모리에 로딩시 단 한번 실행되는 독특한 문법
   // 공유자원 초기화 권장 - test 데이터를 구성
   static { // 초기화 값 대입 - Student 변수와 Subject 변수는 memeber
      stu01 = Student.builder().name("연아").grade(3).build();
      sub01 = new Subject("영어", "유재석");

   }

   public static Model getInstance() {
	      return instance;
	   }
   
   // select * from students where name=?
   public Student queryStudent(String name) {
	   System.out.println("------------------" + name);
      return stu01; // 객체 타입의 기본 값 error message표출을 방지하기 위한 임의값으로 null return
   }

   // select teacher_name from subject where subject_name=?
   public String queryTeacherName(String subjectName) {
      return null;
   }



}