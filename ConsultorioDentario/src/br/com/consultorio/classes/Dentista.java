package br.com.consultorio.classes;

/*
 _______________________________
 |		Dentista 				|
 -------------------------------
 |	nome: String				|
 |	sobrenome: String			|
 |	especialidade: String		|
 |	CRM: String					|
 |	ativo: Boolean				|
 _______________________________|
 |	atender(): void				|
 |	marcar(): void				|
 |	remarcar(): void			|
 |	cancelar(): void			|
 |	viajarCongresso(): Boolean	|
 |______________________________|
 
 
 */

public class Dentista extends Pessoa {
	private String especialidade;
	private Integer CRM;
	private Boolean ativo;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getCRM() {
		return CRM;
	}

	public void setCRM(Integer CRM) {
		this.CRM = CRM;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public Dentista() {
		
	}
	
	public Dentista(String nome, String sobrenome, String especialidade, Integer CRM, Boolean ativo) {
		super();
		this.especialidade = especialidade;
		this.CRM = CRM;
		this.ativo = ativo;
	}

	public void atender() {
		System.out.println("Atendeu paciente");
	}
	
	public Boolean isDisponivel() {
		//System.out.println("Esta disponivel sim ou nao: ");
		return true;
	}
	
}
