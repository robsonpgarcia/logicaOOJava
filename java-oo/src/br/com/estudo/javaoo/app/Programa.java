package br.com.estudo.javaoo.app;

import br.com.estudo.javaoo.classes.Veiculo;

public class Programa {

	// Entry Point
	public static void main(String[] args) { // String[] args parametros que vem quando invoca, exemplo prompt
		
		// classe so define um formato que o veiculo pode ter, nao pode utilizar diretamente a forma
		
		// objetos sao estruturas que assumem a forma da classe que o definiu
		// tipo  do objeto que sera criado
		// corsa: objeto  criado a partir da classe veiculo
		//new indica a invocacao de um construtor, JVM reserva espaco disponivel para guardar objeto
		//construtor, indica que o espaco de memoria deve ser utilizado para guardar o objeto
		System.out.println("*****************************************************************************");
		Veiculo corsa = new Veiculo();
		corsa.setMarca("GM");
		corsa.setNome("corsa");
		corsa.abastecer(10);
		System.out.println(corsa.getNome());
		System.out.println(corsa.getQuantidadeCombustivel() + " litros");
		corsa.ligar();
		corsa.desligar();
		
		System.out.println("*****************************************************************************");
		// uma classe pdoe ser utilizada para declarar varios objetos a partir dela
		Veiculo celta = new Veiculo();
		celta.setMarca("GM");
		celta.setNome("celta");
		System.out.println(celta.getNome());
		celta.ligar();
		celta.desligar();
		System.out.println("*****************************************************************************");

	}

}
