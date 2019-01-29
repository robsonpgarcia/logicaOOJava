package br.com.consultorio.classes;

public abstract class Pessoa {
	
	private String nome;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void marcar(String dia, String horario) {
		System.out.println("Consulta marcada");
	}
	
	public void remarcar(String dia, String horario) {
		System.out.println("Consulta remarcada");
	}
	
	public void cancelar(){
		System.out.println("Consulta cancelada!!!");
	}

	
}
