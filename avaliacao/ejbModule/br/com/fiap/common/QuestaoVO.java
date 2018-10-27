package br.com.fiap.common;

import java.util.ArrayList;
import java.util.List;

public class QuestaoVO {
	
	public QuestaoVO() {}
	
	private Integer id;
	private Integer codigoAvaliacao;
	private String descricao;
	private List<Resposta> respostas;
	private String respostasString;

	public QuestaoVO(Integer id, Integer codigoAvaliacao, String descricao, List<Resposta> respostas, String respostasString) {
		this.id =id;
		this.codigoAvaliacao = codigoAvaliacao;
		this.descricao = descricao;
		this.respostas = respostas;
		this.respostasString = respostasString;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(Integer codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public ArrayList<Resposta> getRespostas() {
		return new ArrayList<Resposta>(respostas);
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	
	public String getRespostasString() {
		return respostasString;
	}

	public void setRespostasString(String respostasString) {
		this.respostasString = respostasString;
	}

}
