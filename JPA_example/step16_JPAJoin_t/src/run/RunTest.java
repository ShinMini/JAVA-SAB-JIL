package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.domain.entity.Company;
import model.domain.entity.Employee;

public class RunTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbinfo");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Company c1 = new Company("playdata", "서초");
		em.persist(c1);
		em.persist(new Company("encore", "공덕"));
		
		em.persist(new Employee("유재석", c1));
		em.persist(new Employee("김연아", c1));
		em.persist(new Employee("신동엽", c1));
		em.persist(new Employee("빌게이츠", c1));
		em.persist(new Employee("스티븐잡스", c1));
		em.persist(new Employee("이승기", c1));
		
		/* inner join 금지
		 * 
		 * ? id가 1(1L) 인 직원의 이름만 검색 실행 ->  select 문장 확인
		 * 
		 * ? 직원이 소속된 회사의 지역만 검색 출력 -> select 문장 확인
		 * 
		 */
		em.flush();
		em.clear();
	
		Employee e = em.find(Employee.class, 1L);
		//System.out.println(e.getEname());
		
		System.out.println(e.getCompanyId().getCompanyAddr());
		tx.commit();	// sql의 commit으로 인지
		em.close();
		emf.close();
	}

}
