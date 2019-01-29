package br.com.treinaweb.zoologico.app;

import br.com.treinamentoweb.zoologico.classes.Animal;
import br.com.treinamentoweb.zoologico.classes.Cachorro;
import br.com.treinamentoweb.zoologico.classes.Gato;
import br.com.treinamentoweb.zoologico.classes.Veterinario;
import br.com.treinamentoweb.zoologico.classes.Zoologico;

public class Programa {

	// Entry Point
	public static void main(String[] args) {

		// cachorro instancia da classe animal, criado a partir da classe animal
		// possui todas as caracteristicas e acoes da classe Animal
		
		// Animal tipo da variavel
		// cachorro: objeto
		Animal animal1 = new Cachorro("Toto", 2);
		
		// classe mais abstrata consegue subsituir com uma concretizacao (Gato)
		// Gato esta dentro de Animal
		// Todo Gato eh um Animal
		// Principio da substuicao de Liscob LSP ou Polimorfismo
		// objeto de um tipo consegue se comportar como um outro objeto
		
		System.out.println("Ola, seu animal �: " + animal1.getEspecie() +
				", o nome do animal �: " + animal1.getNome() +
				" e ele tem " + animal1.getIdade() + " ano(s)");
		
		
		if(animal1.ehAdulto()){
			System.out.println("Animal adulto");
		} else {
			System.out.println("Animal nao � adulto");
		}
		
		
		Gato animal2 = new Gato("Ze", 1);
		
		System.out.println("Ola, seu animal �: " + animal2.getEspecie() +
				", o nome do animal �: " + animal2.getNome() +
				" e ele tem " + animal2.getIdade() + " ano(s)");
		
		if(animal2.ehAdulto()){
			System.out.println("Animal adulto");
		} else {
			System.out.println("Animal nao � adulto");
		}
		
				
		
		System.out.println("===========================================");
		System.out.println("Barulho do cachorro: ");
		animal1.emitirBarulho();
		System.out.println("===========================================");
		System.out.println("Barulho do gato: ");
		animal2.emitirBarulho();
		System.out.println("********************************************");
		animal1.morrer();
		System.out.println("Barulho do cachorro: ");
		animal1.emitirBarulho();
		System.out.println("********************************************");
		animal2.morrer();
		System.out.println("Barulho do gato: ");
		animal2.emitirBarulho();
		
		
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoo TreinaWeb");
		System.out.println("Animais do zoologico: " + zoo.getNome());
		zoo.adicionarAnimal(animal1);
		zoo.adicionarAnimal(animal2);
		zoo.listarAnimais();
		zoo.removerAnimal(0);
		zoo.listarAnimais();
		
		Veterinario vet = new Veterinario();
		vet.setNome("Treina Web");
		vet.atenderAnimal(animal1);
		vet.listarAnimaisAtendidos();
		


	}

}
