package br.com.treinamentoweb.zoologico.classes;

// Animal � uma base para outros tipos de animais, na rua nao vejo um animal e sim um tipo de animal, cachorro
// por isso que conceitualmente a classe Animal deve ser uma classe Abstrata
// existe no mundo real, mas nao pode criar animais pelo mundo, nao pode criar instancias da classe Animal
// nao pode instanciar de maneira direta
// temos animais pelo mundo, mas nao temos animais de maneira direta

public abstract class Animal implements Animavel{
	
	//encapsulamento: nao expor tudo o que pode ser acessado fora da classe
	// sua visibilidade eh definida com os metodos private e public
	// propriedades, caractereisticas ou atributos
	private String nome;
	private String especie;
	// para ser acessada do mesmo pacote
	protected int idade;
	
	// nao pode chamar atributo estaVivo porque ele nao esta publico
	// para nao violar encapsulamento
	// metodo emitir barulho na classe Animal � abstrato, entao nao pode fazer if esta vivo nela
	// para nao deixar publico, a solucao ideal sera deixar metodo visivel para classe 
	// cachorro e gato, sem deixar exposto para outras classes
	// acessado apenas pelas classes maes e filhas
	protected Boolean estaVivo;
	// nao faz sentido expor atributo para fora, pois Programa nao pode setar esse estado, nao � programa que 
	// deve saber se animal esta vivo ou nao
	// nao � interessante expor todos sets e gets
	// interessante seria apenas um get
	
	// metodos acessores: estruturas para acessar membros encapsulados
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		// this qualificador utilizado para falar que o atributo nome recebe o nome que veio como parametro
		this.nome = nome;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// encapsulando utilizando a tecnica de esconder atributos que nao devem ser visiveis, acessados de fora
	// deixando apenas acessivel a leitura
	// o lugar ideal para setar seria no construtor
	// atributos booleanos nao coloca get, padrao do java para melhorar na leitura
	// if(estaVivo())
	public Boolean estaVivo() {
		return estaVivo;
	}
	
	// sobrecarga, um metodo com o mesmo nome mas com assinaturas diferentes
	public Animal() {
		
	}
	
	// assinatura de um metodo � o tipo de retorno, seu nome e tipos recebidos como parametros
	public Animal(String nome) {
		this.nome = nome;
		this.estaVivo = true;
	}
	// construtor colocado depois dos metodos acessores
	public Animal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.estaVivo = true;
	}
	
	// comportamentos, acoes: metodos
	// metodo abstrato naop tem implementacao e forca classe que herda implementar o metodo
	// metodo abstrao so pode estar em uma classe abstrata
	// todo animal emite um barulho, por isso nao foi retirado o metodo dela
	// senao seria descaracterizado o animal
	@Override
	public abstract void emitirBarulho();
	
	// a grande maioria dos animais sao considerados adulto quando tem mais de 1 ano
	// por isso nao compesaria tornar abstrato, pois teria que implementar em todas classes
	// que herdam de Animal
	// se apenas cachorro precisasse alterar a regra de verificar se animal � adulto ou nao
	@Override
	public Boolean ehAdulto() {
		// so verificar se � adulto se ele estiver vivo
		if(estaVivo) {
			return idade >= 1;
		} else {
			return false;
		}
		
	}
	
	// sobrescrita de metodo
	// no java qualquer metodo pode ser sobrescrito
	// metodo morrer() nao seria interessante sobrescrever
	// para garantir que o metodo nao possa sofrer uma sobrescrita
	// utiliza a palavra chave final
	// pois poderia sobrescrever metodo nas classes filhas e poderia 
	// ressuscitar animal
	@Override
	public final void morrer() {
		this.estaVivo = false;
	}
	
}
