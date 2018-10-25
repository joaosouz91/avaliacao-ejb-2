package br.com.fiap.common;

public class QuestaoVO {
	
	public QuestaoVO() {
	}
	
	private Integer id;

	private Integer codigoAvaliacao;

	private String descricao;
	
	public QuestaoVO(Integer id, Integer codigoAvaliacao, String descricao) {
		this.id =id;
		this.codigoAvaliacao = codigoAvaliacao;
		this.descricao = descricao;
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
	
	

}
