package br.com.estudo.javaoo.classes;

import br.com.estudo.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.estudo.javaoo.excecoes.ChassiInvalidoException;
import br.com.estudo.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import br.com.estudo.javaoo.interfaces.AndadorInterface;
import br.com.estudo.javaoo.interfaces.LigadorInterface;
import br.com.estudo.javaoo.interfaces.Veiculo;

/*
 * Para impedir que a classe veiculo seja instanciada, utiliza-se a palavra chave
 * abstract
 * Serve de base para outras classes
 * 
 */
public abstract class VeiculoBase implements Veiculo, LigadorInterface, AndadorInterface {

	/*
	 * Pilares da OO 1 ENCAPSULAMENTO Os atributos nao devem ser acessados
	 * diretamente, para OO deve-se utilizar o encapsulamento encapsulamento:
	 * esconder de classes externas coisas que elas nao deveriam ter acesso todos os
	 * atributos dedem ser alterados e ter os valores recuperados atraves dos
	 * metodos acessores, metodos acessores fazem meio de campo entre classe externa
	 * e os atributos internos metodo acessor get: permite ler um atributo metodo
	 * acessor set: permite escrever em um atributo conversao: get + Nome = getNome
	 * e set + Nome = setNome Metodos acessores por convensao ficam abaixo dos
	 * atributos
	 * 
	 * POJO: padrao de codificacao, permite que crie classes com atributos privados
	 * e tenham acesso pelos metodos acessores
	 * 
	 * Dentro do diagrama UML ja esta subtendido que os metodos get e set ja existem
	 * para cada atributo e nao sao representados no diagrama
	 * 
	 * Uso melhor do encapsulamento: quantidadeCombustivel Para preencher a
	 * quantidade de combusivel, precisa abastecer, nao pode chamar um setQuantidade
	 * de uma classe externa, por isso retira-se o metodo setQuantidadeCombustivel.
	 * 
	 * variaveis int no scopo dla casse sao inicializada com 0
	 * 
	 * this: seta valor da instancia atual que esta sendo utilizada, faz referencia
	 * a propria instancia que esta sendo utilizada para diferenciar o atributo do
	 * parametro utilizado utiliza-se o this no get nao eh necessario colocar this
	 * pois nao tem nenhuma variavel com esse nome no metodo, se existisse uma
	 * variavel com o mesmo nome, precisaria retornar this.nomeAtributo para nao
	 * confundir o java
	 * 
	 * 2 HERANCA Precisa setar a quantidade de rodas, Heranca define caracteristicas
	 * comuns entre as classes Ponto de vista de modelagem, nao é correto colocar
	 * quantidade de portas dentro da classe moto
	 * 
	 * 
	 * 3 POLIMORFISMO: capacidade de um objeto se comportar como se fosse outro
	 * tipos de objeto
	 * 
	 * 4 SOBRECARGA
	 * de construtor e de metodo
	 * 
	 * 5 SOBRESCRITA: possibilidade de alterar um metodo que existe na superclasse e 
	 * sobrescrever dento da subclasse
	 * 
	 * Para impedir que um metodo seja sobrescrito basta utilizar a palavra chave final
	 * ela indica que um metodo nao possa ser sobrescrito
	 * 
	 * Final tambem impede que uma classe herde de outra, para impedir que uma classe seja herdada,
	 * utiliza-se a palavra final antes de sua declacacao
	 * 
	 * 5 ABSTRACAO
	 * Para uma clase nao ser instanciada utiliza-se a palavra chave abstract na sua declaracao
	 * 
	 * public: atributo de visibilidade que permite que uma classe externa acesse o
	 * atributo
	 *  private: atributo de visibilidade que permite que uma classe externa nao
	 * acesso o atributo diretamente, apenas com um metodo acessor
	 * Metodos abstratos nao possuem implementacao
	 * todo veiculo precisa ter uma preparacao, mas a preparacao muda de veiculo para veiculo
	 * Obriga as clases filhas a implementa-lo
	 * metodos abstratos so podem existir nas classes abstratas
	 * 
	 * 
	 * UML
	 * + representa publico
	 * - representa privado
	 * # representa protegido
	 * ~ representa visibilidade pacote
	 * 
	 * final nao tem na UML, entao utiliza-se esteriotipo entre chaves (final)
	 * mas a maioria das pessoas nao indicam
	 * 
	 * colocando em italico define um metodo ou classe abasstrada
	 * classe final coloca-se em frente do nome coloca classe(leaf)
	 * retorno do construtor nao precisa colocar
	 * 
	 * 6 INTERFACES
	 * Contrato para garantir quais acoes quem assinar deve fazer, fala que deve fazer algo, mas nao 
	 * é espeficificado como sera cumprido, isso fica sob responsabilidade de quem assina
	 * 
	 */

	private String nome;
	private String marca;
	private String chassi;
	protected int quantidadeRodas;
	private float quantidadeCombustivel; // numero quebrado 32 bits
	private Boolean ligado;
	protected float velocidade;
	// se tiver 10 subclasses precisaria alterar ligado para false na criacao,
	// duplica codigo
	// para corrigir isso,

	public VeiculoBase() {
		// quando criar uma subclasse, elas ja terao ligado = false
		this.ligado = false;
		this.velocidade = 0;
		// sera sempre chamado ao criar uma subclasse
	}

	/**************************
	 * ACESSORES INICIO
	 *****************************************************************************/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	/*
	 * Principio da substuicao de LISCOV, cinetista da computacao que ajudou a
	 * formalizar um dos principais pilares da OO se tem uma subclasse, ela pode ser
	 * definida pela superclasse por isso pode lancar a excecao como Exception
	 * POLIMORFISMO: capacidade de um objeto se comportar como se fosse outro tipos
	 * de objeto por isso poderia lancar excecao como Exception boa pratica é passar
	 * as excecoes que podem gerar
	 */

	public void setChassi(String chassi) throws ChassiInvalidoException { // Exception {
		// throws Exception { // throws RuntimeException {
		// encapsulamento de uma regra de validacao do tamanho do chassi
		if (chassi.length() == 5) {
			// validacao de dados com 5 caracteres, o ideal seria validar no metodo set
			this.chassi = chassi;
		} else {
			// trocar o retorno do metodo para boolean nao eh recomendado, pois alguns
			// frameworks trabalham com void
			// como eh uma situacao de erro o ideal seria disparar uma excecao
			// como nao eh excecao do java, eu preciso notificar o erro

			// exception: previsiveis. precisa capturar com try casch, pois compilador
			// acusa o erro
			// throw new Exception("O chassi informado é invalido!");
			// throw new ChassiInvalidoException("O chassi informado é invalido!");
			throw new ChassiInvalidoException(chassi);

			// runTimeException: Nao sao previsiveis, so podem ser capurada em tempo de
			// execucao
			// nao eh obrigado a capturar com try catch, pois compilador nao acusa erro
			// throw new RuntimeException("O chassi informado é invalido!");

		}
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	// nao pode ser acessado por outra classe
	/*
	 * public void setQuantidadeRodas(int quantidadeRodas) { this.quantidadeRodas =
	 * quantidadeRodas; }
	 */

	/*
	 * Como fugiu do padrao java, nao tendo atributo set, precisa representar no
	 * diagerama UML atributo privado na UML representa com um sinal de "-" atributo
	 * public na UML representa com um sinal de "+" Esteriotipos: Psra evitar
	 * repetir varias vezes atributos get/set no diagrama, pode-se utilizar um
	 * esteriotipo <<nomeEsteriotipo>>: <<get,set>> - nome: String + marca: String:
	 * sem esteriotipo
	 * 
	 */
	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	/*
	 * Retirada por causa do encapsulamento, pois quantidade de combusivel so deve
	 * ser alterada abastecendo
	 *
	 *
	 * public void setQuantidadeCombustivel(float quantidadeCombustivel) {
	 * this.quantidadeCombustivel = quantidadeCombustivel; }
	 * 
	 * 
	 * So podera ser alterado por fora pelo metodo ligar()
	 * 
	 * public void setLigado(Boolean ligado) { this.ligado = ligado; }
	 */

	// Boolean deve ser isLigado, eclipse gera por default getLigado
	public Boolean isLigado() {
		return ligado;
	}
	
	public float getVelocidade() {
		return velocidade;
	}

	
	/**************************
	 * ACESSORES FIM
	 ***********************************************************************************/

	

	/**************************
	 * ACOES INICIO
	 ***********************************************************************************/
	// ACOES
	/*
	 * final impede que metodo seja substituido
	 * 
	 */
	public final void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("O veiculo ligou!");
	}

	/*
	 * final impede que metodo seja substituido
	 * 
	 */
	public final void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("O veiculo desligou!");
	}

	/*
	 * final impede que metodo seja substituido
	 * 
	 */
	public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
		// nao pode abastecer veiculo se ele tiver ligado
		if (!this.ligado) { // this.ligado ==true: pessima pratica
			quantidadeCombustivel += litros;
			// situacoes negativas costuma deixar no else por convencao

		} else {
			throw new AbastecimentoVeiculoLigadoException();
		}

	}
	
	// nao pode acelerar veiculo se ele estiver ligado
	public void acelerar() throws AceleracaoVeiculoLigadoException{
		if(this.ligado) {
			//this.velocidade = 0;
			this.velocidade += 10; // short hand operador
		} else {
			throw new AceleracaoVeiculoLigadoException();
		}
	}
	public void frear() throws FrenagemVeiculoDesligadoException{
		if(this.ligado) {
			this.velocidade -= 10; // short hand operador
		} else {
			throw new FrenagemVeiculoDesligadoException();
		}
	}
	
	// Metodos abstratos nao possuem implementacao
	/*todo veiculo precisa ter uma preparacao, mas a preparacao muda de veiculo para veiculo
	 * Obriga as clases filhas a implementa-lo
	 */
	public abstract void preparar();
	
	/**************************
	 * ACOES FIM
	 ***********************************************************************************/

}
