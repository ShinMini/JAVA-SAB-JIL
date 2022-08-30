package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.domain.entity.Dept;
import model.domain.entity.Emp;
import util.DBUtil;

public class EmpDeptDAO {

	private static EmpDeptDAO instance = new EmpDeptDAO();

	private EmpDeptDAO() {
	}

	public static EmpDeptDAO getInstance() {
		return instance;
	}

	public List<Emp> findElementAll() throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		List<Emp> emps = null;

		try {
			emps = em.createQuery("select e from Emp e").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return emps;
	}

	public List<Dept> findElementDept() throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		List<Dept> depts = null;

		try {
			depts = em.createQuery("select d from Dept d").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return depts;
	}

	public Emp findEmployee(long id) throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		Emp employee = null;

		try {
			employee = em.find(Emp.class, id); // employee 로 부터 select
			employee.getDeptno().getDname(); // 부서명 dept에 존재 dept select
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return employee;
	}

	public Dept findDept(int deptno) throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		Dept dept = null;

		try {
			dept = em.find(Dept.class, deptno); // em.find(Dept.class, new int(deptno)) 으로 변환
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
		return dept;
	}

	public void createEmployee(Emp employee) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(employee);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}

	public void updateEmployee(long updateId, long updateSal) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			Emp e = em.find(Emp.class, updateId);
			e.setSal(updateSal);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}

	public void deleteElement(long deleteId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			Emp employee = em.find(Emp.class, deleteId);
			em.remove(employee);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}

}
