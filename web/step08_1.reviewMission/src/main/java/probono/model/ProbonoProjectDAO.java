﻿/*
CREATE TABLE probono_project (
	   probono_project_id     		NUMBER(5) PRIMARY KEY,
	   probono_project_name 		VARCHAR2(50) NOT NULL,
       probono_id           			VARCHAR2(50) NOT NULL,       
       probonoProject_id          				VARCHAR2(20) NOT NULL,
       receive_id           				VARCHAR2(20) NOT NULL, 
       project_content      			VARCHAR2(100) NOT NULL
);   */
package probono.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import probono.model.dto.ProbonoProjectDTO;
import util.DBUtil;

public class ProbonoProjectDAO {

	public static void createProbonoProject(ProbonoProjectDTO probonoProject) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(probonoProject);
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

	public void updateProbonoProject(int probonoProjectId, String projectContent) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			ProbonoProjectDTO a = em.find(ProbonoProjectDTO.class, probonoProjectId);
			a.setProjectContent(projectContent);

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

	public void deleteProbonoProject(int probonoProjectId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			ProbonoProjectDTO a = em.find(ProbonoProjectDTO.class, probonoProjectId);
			em.remove(a);
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

	public ProbonoProjectDTO getProbonoProject(int id) throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		ProbonoProjectDTO probonoProject = null;

		try {
			probonoProject = em.find(ProbonoProjectDTO.class, id);
			// probonoProject.getId().getMajor(); // 부서명// dept에 존재 dept select }
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return probonoProject;
	}

	public List<ProbonoProjectDTO> getAllProbonoProjects() throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		List<ProbonoProjectDTO> probonoProjects = null;

		try {
			probonoProjects = em.createQuery("select pj from probonoProject pj").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return probonoProjects;
	}
}
