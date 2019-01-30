package br.com.estudo.javaoo.interfaces;

import br.com.estudo.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.FrenagemVeiculoDesligadoException;

//contrato
public interface Veiculo {
	
	// clausulas
	/*
	 * Automaticamente qualquer metodo tem que ser publico
	 * Excecoes devem ser escritas na interface
	 * Se Classe que implementa interface for abstrata, as filhas que precisam implementar
	 * Interface nome do define a assinatura(retorno, tipo dos parametros e respectiva ordem)
	 * 1 classe pode implementar varias interfaces
	 */
	
	void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;
	void preparar();
		
	
}
