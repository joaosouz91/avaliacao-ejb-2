package br.com.fiap.common;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;

import br.com.fiap.Avaliacao;

@Stateless
@WebService(name="service")
public class AvaliacaoBean implements Avaliacao {
	
	@PersistenceContext(name="fiapPU")
	private EntityManager em;
	
	private Dao dao;
	
	@PostConstruct
	@Transient
	public void init() {
		dao = new Dao(em);
	}
	
	@Override
	public List<QuestaoVO> obterQuestoes(int codigoAvaliacao) {
		
		List<QuestaoVO> questoes = new ArrayList<QuestaoVO>();
		
		for(Questao q : dao.getListByQuery()) {
			questoes.add(new QuestaoVO(q.getId(), q.getCodigoAvaliacao(), q.getDescricao()));
		}
		
		return questoes;
	}

	@Override
	@Transient
	public void removerEJB() {
		
	}
}
