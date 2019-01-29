package br.com.treinaweb.calculadora.classes;

public class Divisao extends CalculoMatematico {

	public Divisao(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean validar() {
		return numero1 >= 0 && numero2 > 0;
	}
	
	@Override
	protected int doCalcular() {
		return numero1 / numero2;
	}

}
