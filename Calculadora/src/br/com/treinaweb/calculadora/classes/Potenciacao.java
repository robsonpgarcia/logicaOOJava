package br.com.treinaweb.calculadora.classes;

public class Potenciacao extends CalculoMatematico {

	public Potenciacao(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int doCalcular() {
		return (int)Math.pow(numero1, numero2);
	}

}
