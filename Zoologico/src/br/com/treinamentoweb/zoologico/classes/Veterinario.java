package br.com.treinamentoweb.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

//agregacao: veterinario atende animal, veterinario existe sem atender animais do zoologico
//veterinario nao eh composto por animais, ele atende animais, agregacao
public class Veterinario {
	private String nome;
	private List<Animal> animais;
	// 1 veterinario pode atender varios animais, mas do ponto de vista do animal para veterinario
	// 1 animal so pode ser atendido por um unico veterinario
	// Cardinalidde 1 para N de agregacao
	
	// se veterinario pudesse atender varios animais e varios animais pudessem ser atendidos por 
	// varios veterinarios, seria cardinalidade N para N

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Veterinario() {
		animais = new ArrayList<Animal>();
		
	}
	
	public void atenderAnimal(Animal animalASerAtendido) {
		animais.add(animalASerAtendido);
	}
	
	public void deixarDeAtenderAnimal(int indiceAnimal) {
		animais.remove(indiceAnimal);
	}
	
	public void listarAnimaisAtendidos() {
		System.out.println("Animais atendidos");
		for(int i = 0; i < animais.size(); i++) {
			System.out.println("  - " + animais.get(i).getNome());
		}
	}

}
