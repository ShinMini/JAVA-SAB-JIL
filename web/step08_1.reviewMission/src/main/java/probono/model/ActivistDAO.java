﻿/* CREATE TABLE activist (
       activist_id          VARCHAR2(20)  PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       major                VARCHAR2(50) NULL
);  */
package probono.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import probono.model.dto.ActivistDTO;
import util.DBUtil;

public class ActivistDAO {

	public boolean createActivist(ActivistDTO activist) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(activist);
			tx.commit();

			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}

	public boolean updateActivist(int activistId, String major) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			ActivistDTO a = em.find(ActivistDTO.class, activistId);
			a.setMajor(major);

			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}

	public boolean deleteActivist(int activistId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			ActivistDTO a = em.find(ActivistDTO.class, activistId);
			em.remove(a);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}

	public ActivistDTO getActivist(int id) throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		ActivistDTO activist = null;

		try {
			activist = em.find(ActivistDTO.class, id);
			// activist.getId().getMajor(); // 부서명// dept에 존재 dept select }
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return activist;
	}

	public List<ActivistDTO> getAllActivists() throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		List<ActivistDTO> activists = null;

		try {
			activists = em.createQuery("select a from activist a").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return activists;
	}
}