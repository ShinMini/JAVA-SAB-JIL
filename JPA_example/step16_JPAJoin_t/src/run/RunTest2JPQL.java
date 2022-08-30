package run;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import model.domain.entity.Employee;
import util.DBUtil;

@Slf4j
public class RunTest2JPQL {
	//한명의 직원 검색 - find()
//	@Test
	public void step01() {
		EntityManager em = DBUtil.getEntityManager();
		Employee e = em.find(Employee.class, 1l);
		System.out.println(e.getEname());		
	}
	
	//모든 직원 검색 
	//select * from employee;
	/* JPA 기반의 select 문장 생성시 즉 JPQL 기법을 table기준이 아닌 entity가 기준
	 * 
	 * Employee 라는 Entity 클래스의 모든 멤버 변수를 e로 검색함을 의미 
	 * select e from Employee e
	 */
//	@Test
	public void step02() {
		EntityManager em = DBUtil.getEntityManager();
		//db로 부터 검색된 데이터를 코드상에서 사용 가능한 list로 변환
		// e라는 별칭에는 Employee의 모든 멤버 변수들 보유 e.ename 문법
		List<Employee> all = em.createQuery("select e from Employee e").getResultList();
		
		for(Employee e : all) {
			System.out.println(e);
		}
	}

	/* JPQL - select e.ename from Employee e
	 * sql - select ename from Employee
	 */
//	@Test
	public void step03() {
		EntityManager em = DBUtil.getEntityManager();
		List<String> all = em.createQuery("select e.ename from Employee e").getResultList();
		for(String e : all) {
			System.out.println(e);
		}
	}
	
	/* 모든 직원수 검색 
	 * 	sql - select count(*) from employee;
	 * 
	 *  김으로 시작하는 모든 직원의 이름 검색 
	 * 	sql -select ename from Employee where ename like '김%'
	 * 
	 * company_id로 사원들의 사번과 이름 검색
	 *  sql - select empno, ename from employee where company_id=1;
	 * 
	 */
	@Test
	public void step04() {
		log.info("****** lombok에서 제공하는 log API******");
		EntityManager em = DBUtil.getEntityManager();

//		
		List<String> all2 = em.createQuery("select e.ename from Employee e where ename like '김%'").getResultList();
//		for(String e : all2) {
//			System.out.println(e);
//		}
		all2.forEach(System.out::println);
		
		System.out.println("********************");
		
//		System.out.println(em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList());
		
		
		List<Employee> all = em.createQuery("select e from Employee e where company_id=1").getResultList();
		for(Employee e : all) {
			System.out.println(e.getEmpno() + " " + e.getEname());
		}
		
		//List<Object> 와 동일한 코드
		List all3 = em.createQuery("select e from Employee e where company_id=1").getResultList();
		for(Object o3 : all3) {
			Employee e = (Employee)o3;
			System.out.println(e.getEmpno() + " " + e.getEname());
		}
		
		
		
		all.forEach(v -> System.out.println(v.getEmpno() + " " + v.getEname()));
		
		System.out.println("**** 고민해 보기 (중요) ****");
		//System.out.println(em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList().get(0));
		
		/* 다형성
		 *  - 상속 기반의 형변환
		 *  - 자식 타입의 변수에 부모 타입의 객체를 변환
		 *  - List<Employee> createQuery("Employee").getResultList()
		 *  - List<String> createQuery("Employee의 ename들만 검색").getResultList()
		 *  - List<Object[]>
		 */
//		Object o = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList().get(0);
//		System.out.println((Object[])o);
//		System.out.println( ((Object[])o)[0] );
//		System.out.println( ((Object[])o)[1] );
		
		List<Object[]> o = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList();
		System.out.println(o.get(1)[0] + " " + o.get(1)[1]);
		

		System.out.println("*** 코드 뜯어보기 ***");
		List o2 = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList();
		Object[] obj = (Object[])o2.get(0);
		System.out.println(obj.length);
		
		System.out.println("*** 개수 counting ***");
		//검색된 데이터는 개수값을 보유한 하나의 row 구조로 검색 즉 size()는 list에 몇개의 row 즉 데이터 수 카운팅
//		int count = em.createQuery("select count(*) from Employee e").getResultList().size();
		
		//int count = em.createQuery("select count(*) from Employee e").getSingleResult();
		System.out.println(em.createQuery("select count(*) from Employee e").getSingleResult());
		
		System.out.println("*** 사번으로 직원 한명 검색 ***");
		Employee emp = (Employee)em.createQuery("select e from Employee e where empno=2").getSingleResult();
		System.out.println(emp);
	}

	
}
