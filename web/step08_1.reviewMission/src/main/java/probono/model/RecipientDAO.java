﻿package probono.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import probono.model.dto.RecipientDTO;
import util.DBUtil;

public class RecipientDAO {

	public void createRecipient(RecipientDTO recipient) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(recipient);
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

	public void updateRecipient(int recipientId, String receiveContent) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			RecipientDTO a = em.find(RecipientDTO.class, recipientId);
			a.setReceiveContent(receiveContent);

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

	public void deleteRecipient(int recipientId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			RecipientDTO a = em.find(RecipientDTO.class, recipientId);
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

	public RecipientDTO getRecipient(int id) throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		RecipientDTO recipient = null;

		try {
			recipient = em.find(RecipientDTO.class, id);
			// recipient.getId().getMajor(); // 부서명// dept에 존재 dept select }
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return recipient;
	}

	public List<RecipientDTO> getAllRecipients() throws Exception {
		EntityManager em = DBUtil.getEntityManager();

		List<RecipientDTO> recipients = null;

		try {
			recipients = em.createQuery("select r from recipient r").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}

		return recipients;
	}
}