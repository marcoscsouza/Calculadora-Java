package br.com.marcoscsouza.calculadora.dominio;

public class Calculadora {
	
	private float num1;
	private float num2;

	public Calculadora(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public float somar() {
		return num1 + num2;
	}
	public float subtrair() {
		return num1 - num2;
	}

	public float multiplicar() {
		return num1 * num2;
	}

	public float dividir() {
		return num1 / num2;
	}


}
