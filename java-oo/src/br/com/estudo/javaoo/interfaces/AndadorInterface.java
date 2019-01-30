package br.com.estudo.javaoo.interfaces;

import br.com.estudo.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public interface AndadorInterface {
	
	void acelerar() throws AceleracaoVeiculoLigadoException;
	void frear() throws FrenagemVeiculoDesligadoException;
	
}
