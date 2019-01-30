package br.com.estudo.javaoo.classes;

import br.com.estudo.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import br.com.estudo.javaoo.interfaces.AndadorInterface;
import br.com.estudo.javaoo.interfaces.LigadorInterface;
/*
 * Ele nao abastece, entao nao precisa implementar a interface Veiculo
 * 
 */
public class CarrinhoControleRemoto implements LigadorInterface, AndadorInterface{

	@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frear() throws FrenagemVeiculoDesligadoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

}
