package br.com.estudo.javaoo.app;

import br.com.estudo.javaoo.classes.Moto;
import br.com.estudo.javaoo.classes.VeiculoBase;
import br.com.estudo.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.ChassiInvalidoException;

/*
 * interface: define padroes comportamentos, nao guarda estado, nao define atributos
 * 
 * classes abstrata: guarda estado, atributos, nao serve para definir padroes de comporamentos, servem para definir 
 * estruturas que sejam comuns entre as classes
 * 
 * 
 * 
 * 
 */

/*
 * PILARES DA OO
 *
	Encapsulamento
	Herança
	Abstração
	Polimorfismo
 */
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
		
		//Carro corsa = new Carro("Corsa", "GM");
		//Veiculo corsa = new Carro("Corsa", "GM"); // LISCOV: principio da subsuicao
		VeiculoBase corsa = new Moto(); // LISCOV: principio da subsuicao
		/*POLIMORFISMO: capacidade de um objeto se comportar como se fosse outro tipos de objeto
		 * tecnica utilizada para se conectar ao BD
		 * Orientado as abstracao
		 * Veiculo é a abstracao, nivel mais alto da heranca
		 * 
		 */
		// Objeto polimorfico
		//((Carro)corsa).setQuantidadePortas(4);// convertendo corsa para compilador entender como um carro
		// pois setQuantidadePortas é um atributo de carro e nao de Veiculo
		
		try {
			corsa.preparar();
			corsa.abastecer(10);
			corsa.ligar();
			//corsa.abastecer(10);
			corsa.setChassi("12345");
			
			//System.out.println(corsa.getNome());
			//System.out.println(corsa.getQuantidadeCombustivel() + " litros");
			//System.out.println(corsa.getQuantidadeRodas() + " rodas");
			//System.out.println(String.format("O veiculo [%s] esta ligado? [%b]", corsa.getNome(), corsa.isLigado()));
			//System.out.println(String.format("O veiculo [%s] possui [%d] portas", corsa.getNome(), ((Carro)corsa).getQuantidadePortas()));
			//corsa.ligar();
			corsa.acelerar();
			System.out.println(String.format("Velocidade atual do veiculo: %f", corsa.getVelocidade()));
			corsa.frear();
			System.out.println(String.format("Velocidade atual do veiculo: %f", corsa.getVelocidade()));
			corsa.desligar();
			
			/*
			System.out.println("*****************************************************************************");
			// uma classe pdoe ser utilizada para declarar varios objetos a partir dela
			//Veiculo celta = new Veiculo();
			Carro celta = new Carro();
			celta.setMarca("GM");
			celta.setNome("celta");
			System.out.println(celta.getNome());
			celta.ligar();
			celta.desligar();
			System.out.println("*****************************************************************************");
			Moto moto = new Moto();
			moto.setNome("CBR");
			moto.setMarca("Honda");
			moto.ligar();
			//moto.desligar();
			System.out.println(String.format("A moto [%s] esta ligada? [%b]", moto.getNome(), moto.isLigado()));
			System.out.println("*****************************************************************************");
			*/
			
		} 
		catch (AbastecimentoVeiculoLigadoException e) {
			//e.printStackTrace();
			System.out.println("Voce nao pode abastecer um veiculo enquanto ele estiver ligado");
		} 
		catch (ChassiInvalidoException e) {
			//e.printStackTrace();
			System.out.println("O chassi é invalido: " + e.getMessage());
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		

	}

}
