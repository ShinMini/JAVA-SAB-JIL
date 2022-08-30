package run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;

import model.domain.entity.Dept;
import util.DBUtil;

public class RunTest {

	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		
		// @NamedQuery(name = "Dept.findDnameByDeptno", query = "select d.dname from Dept d where d.deptno = :deptno")
		// Dept d1 = (Dept)em.createNamedQuery("Dept.findDnameByDeptno").setParameter("deptno", 10L).getSingleResult();
		String d2 = (String)em.createNamedQuery("Dept.findDnameByDeptno").setParameter("deptno", 10L).getSingleResult();
	
		// System.out.println(d1);
		System.out.println(d2);

		//? 모든 검색 
		//@NamedQuery(name = "Dept.findDept", query = "select d from Dept d")
		List<Dept> depts = em.createNamedQuery("Dept.findDept").getResultList();
		depts.forEach(System.out::println);
		
				
		
		em.close();
		em = null;
	}

}
