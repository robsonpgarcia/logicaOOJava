package br.com.treinaweb.calculadora.classes;

public class Multiplicacao extends CalculoMatematico {

	public Multiplicacao(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int doCalcular() {
		return numero1 * numero2;
	}
	

}
