package br.com.fiap;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface Avaliacao {

   public List obterQuestoes(int codigoAvaliacao);
   public void removerEJB();
}
