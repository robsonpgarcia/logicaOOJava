package br.com.estudo.javaoo.classes;

// Um carro é um veiculo, por isso utiliza heranca
// Classe Carro nao pode ter filhos por causa do final
public final class Carro extends VeiculoBase {
	
	// como existem veiculos que nao tem portas, esse atributo é ideal ficar dentro dos veiculos que tem
	private int quantidadePortas;
	
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	// construtor sobrecarregado
	public Carro() {
		// seta a quantidade de rodas no construtor, pois classe externa nao pode fazer essa 
		// alteracao
		// por isso qtdeRodas precisa ser protected, pois veiculo nao pode setar paras 4 rodas \
		// porque pode ter outros tipo de veiculos
		// visibilidade nivel de pacote nao pode ser utilizado, pois se tiver outro tipo de veiculo
		// essa classe podera acessar
		// para resolver esse problema, utiliza o atributo de visibilidade protected
		// para ser acessado apenas pela classe veiculo e pela subclasse
		/*
		 * private: apenas dentro da classe
		 * public: todo mundo acessa
		 * protected: apenas classe e subclasse
		 * package level default: visibilidade nivel pacote: 
		 * 
		 * SOBRECARGA
		 * varios metodos alterando assinatura para construtores e para metodos, podendo alterar ordem da assinatura
		 * assinatura: parametros teste(int a, float b) != teste(float b, int a)
		 * assinatura valida: quantidade parametros, tipo parametros e ordem tipo parametros
		 * 
		 * HERANCA: 1 classe mae pode ter varias filhas, mas 1 filho so pode er uma unica mae
		 * cada classe só pode extender 1 classe alem de Object que já é extendida por default
		 * Heranca multipla: uma subclasse pode herdar varias classes, java nao permite
		 * Heranca multipla tem manutencao mais complicada
		 */
		 
		
		this.quantidadeRodas = 4;
	}
	
	// construtor sobrecarregado
	public Carro(String nome, String marca) {
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o cinto de seguranca");
		
	}
	
	
	
	
}
