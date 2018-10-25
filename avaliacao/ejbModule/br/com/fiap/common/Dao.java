package br.com.fiap.common;

import java.util.List;

import javax.persistence.EntityManager;

public class Dao {

	private EntityManager em;

	public Dao(EntityManager em) {
		this.em = em;
	}

	public List<Questao> getListByQuery() {

		try {
			return em.createNativeQuery("SELECT * FROM QUESTAO", Questao.class).getResultList();
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}

}
