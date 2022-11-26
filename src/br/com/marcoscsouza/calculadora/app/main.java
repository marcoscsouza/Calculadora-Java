package br.com.marcoscsouza.calculadora.app;

import java.util.Scanner;

import br.com.marcoscsouza.calculadora.dominio.Calculadora;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora");
		
		System.out.print("Digite um numero: ");
		float num1 = sc.nextFloat();
		System.out.print("Digite o operador: ");
		String operador = sc.next();
		System.out.print("Digite outro numero: ");
		float num2 = sc.nextFloat();
		
		Calculadora calc = new Calculadora(num1,num2);
		
		if ("+".equals(operador)) {
			System.out.println("Soma: " + calc.somar());
		} else if ("-".equals(operador)) {
			System.out.println("Soma: " + calc.subtrair());
		} else if ("*".equals(operador)) {
			System.out.println("Soma: " + calc.multiplicar());
		} else if ("/".equals(operador)) {
			System.out.println("Soma: " + calc.dividir());
		} else {
			System.out.println("operador inválido!");
		}
		
		
		
		sc.close();
	}

}
