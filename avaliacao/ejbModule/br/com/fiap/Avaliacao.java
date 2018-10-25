package br.com.fiap;

import java.util.List;

import javax.ejb.Remote;

import br.com.fiap.common.Questao;
import br.com.fiap.common.QuestaoVO;

@Remote
public interface Avaliacao {

	public List<QuestaoVO> obterQuestoes(int codigoAvaliacao);

	public void removerEJB();
}
