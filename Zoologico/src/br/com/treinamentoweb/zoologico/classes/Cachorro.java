package br.com.treinamentoweb.zoologico.classes;

// cachorro é um animal
// Animal é classe mae, superclasse de cachorro
public class Cachorro extends Animal {
	public Cachorro(String nome) {
		super(nome);
	}
	
	public Cachorro(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade, "Cachorro");
	}
	
	@Override // sobrescrita de metodo
	// no java qualquer metodo pode ser sobrescrito
	// metodo morrer() nao seria interessante sobrescrever
	// para garantir que o metodo nao possa sofrer uma sobrescrita
	// utiliza a palavra chave final
	
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Au au");
		} else {
			System.out.println("O animal morreu");
		}
		
	}
	
	// a grande maioria dos animais sao considerados adulto quando tem mais de 1 ano
	// por isso nao compesaria tornar abstrato, pois teria que implementar em todas classes
	// que herdam de Animal
	// se apenas cachorro precisasse alterar a regra de verificar se animal é adulto ou nao
	// precisa sobrescrever metodo ehAdulto
	@Override
	public Boolean ehAdulto() {
	// so verificar se é adulto se ele estiver vivo
		if(estaVivo) {
			return idade >= 2;
		} else {
			return false;
		}
		
	}
	
}
