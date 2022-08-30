﻿/*
 * CREATE TABLE probono (
       probono_id           	VARCHAR2(50) PRIMARY KEY,
       probono_name     	VARCHAR2(50) NOT NULL,
       probono_purpose  VARCHAR2(200) NOT NULL
);  */
package probono.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import probono.model.dto.ProbonoDTO;
import util.DBUtil;

public class ProbonoDAO {
	public boolean createProbono(ProbonoDTO probono) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(probono);
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

	public void updateProbonoName(int probonoId, String name) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			ProbonoDTO a = em.find(ProbonoDTO.class, probonoId);
			a.setProbonoName(name);

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

	public boolean updateProbonoPurpose(int probonoId, String purpose) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			ProbonoDTO a = em.find(ProbonoDTO.class, probonoId);
			a.setProbonoPurpose(purpose);
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

	public boolean deleteProbono(int probonoId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			ProbonoDTO a = em.find(ProbonoDTO.class, probonoId);
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

	public ProbonoDTO getProbono(int id) throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		ProbonoDTO probono = null;

		try {
			probono = em.find(ProbonoDTO.class, id);
			// probono.getId().getMajor(); // 부서명// dept에 존재 dept select }
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return probono;
	}

	public List<ProbonoDTO> getAllProbonos() throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		List<ProbonoDTO> probonos = null;

		try {
			probonos = em.createQuery("select p from probono p").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return probonos;
	}

	public static ProbonoDAO getInstance() {
		return null;
	}
}