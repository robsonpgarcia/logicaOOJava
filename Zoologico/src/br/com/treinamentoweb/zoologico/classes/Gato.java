package br.com.treinamentoweb.zoologico.classes;

public class Gato extends Animal {
	
	public Gato(String nome) {
		super(nome);
	}
	
	public Gato(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}
	
	public Gato(String nome, int idade) {
		super(nome, idade, "Gato");
	}
	
	@Override // sobrescrita de metodo
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Miau, Miau");
		} else {
			System.out.println("O animal morreu");
		}
		
	}
}

