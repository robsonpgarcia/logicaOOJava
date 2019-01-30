package br.com.estudo.javaoo.classes;

import br.com.estudo.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.FrenagemVeiculoDesligadoException;
//Classe Moto nao pode ter filhos por causa do final
public final class Moto extends VeiculoBase {
	
	public Moto() {
		this.quantidadeRodas = 2;
	}
	
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	/*
	 * 
	 *  moto a regra é diferente na aceleracao e frenagem
	 *  ela acelera e freia de 3 em 3, para isso utiliza-se o recurso de 
	 *  sobrescrita, utilizando a anotation para alterar a caracteristica de um comportamento
	 *  de 1 metodo da classe mae
	 *  
	 */ 
	
	@Override // anotation
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		if(this.isLigado()) {
			//this.velocidade = 0;
			this.velocidade += 3; // short hand operador
		} else {
			throw new AceleracaoVeiculoLigadoException();
		}
	}
	
	@Override // anotation
	public void frear() throws FrenagemVeiculoDesligadoException {
		if(this.isLigado()) {
			this.velocidade -= 3; // short hand operador
		} else {
			throw new FrenagemVeiculoDesligadoException();
		}
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o capacete");
		
	}
	
		
	
}
