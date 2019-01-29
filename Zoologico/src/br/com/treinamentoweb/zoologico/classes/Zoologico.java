package br.com.treinamentoweb.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

// composicao precisa adicionar instancias de outro objeto para existir


public class Zoologico {
	private String nome;
	// composicao, zoologico para existir precisa ter animais dentro dele,
	// zoologico depende conceitualmente de animais para existir, eh composicao
	private List<Animal> animais;
	// lista de animal eh um estado interno, faz parte, nao pode colocar get set
	// paras lista,
	// senao expoe para fora do programa a lista
	// sera criado metodos para fazer esse trabalho
	// cardinalidade multipla, 1 zoologico pode conter N animais
	// mas 1 animal pode conter apenas 1 zoologico
	// sempre pega a maior, 1 pra N, 1 zoologico para varios animais
	// Cardinalidade 1 para N de conmposicao

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Zoologico() {
		// animais = new List<Animal>();// List eh um interface, por isso nao pode dar new
		// estrutura de dados
		animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal animalASerAdicionado) {
		animais.add(animalASerAdicionado);
	}
	
	public void removerAnimal(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	
	public void listarAnimais() {
		System.out.println("Animais do zoologico");
		for(int  i = 0; i < animais.size(); i++) {
			System.out.println("   - "  +  animais.get(i).getNome());
		}
	}

}
