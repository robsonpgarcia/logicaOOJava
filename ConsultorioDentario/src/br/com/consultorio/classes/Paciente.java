package br.com.consultorio.classes;

public class Paciente extends Pessoa {
	/*
 ___________________________
 |		Paciente 			|
 ----------------------------
 |	codigo: int				|
 |	nome: String			|
 |	sobrenome: String		|
 |	idade: int				|
 |	sexo: String			|
 |	telefone: Integer		|
 |	endereco: String		|
 |__________________________|
 |	marcar(): void			|
 |	remarcar(): void		|
 |	consultar(): void		|
 |	cancelar(): void		|
 |__________________________|
 */
	
	private int	codigo;
	private int	idade;
	private String	sexo;
	private String	telefone;
	private String	endereco;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Paciente() {
		
	}
	
	public Paciente(String nome, String sobrenome, int codigo, int idade, 
			String sexo, String telefone, String endereco) {
		super();
		this.codigo = codigo;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public void consultar() {
		System.out.println("Consultado");
	}
	
	
}
