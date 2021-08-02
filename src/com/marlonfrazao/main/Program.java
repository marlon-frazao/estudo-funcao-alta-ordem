package com.marlonfrazao.main;

public class Program {

	public static void main(String[] args) {
		Calculo soma = (a, b) -> a + b;		
		System.out.println("Retorna soma 4 + 2: " +executarOpera��o(soma, 4, 2));
		
		Calculo subtracao = (a, b) -> a - b;
		System.out.println("Retorna subtra��o 4 - 2: " +executarOpera��o(subtracao, 4, 2));
		
		Calculo multiplicacao = (a, b) -> a * b;
		System.out.println("Retorna multiplica��o 4 * 2: " +executarOpera��o(multiplicacao, 4, 2));
		
		Calculo divisao = (a, b) -> a / b;
		System.out.println("Retorna divis�o 4 * 2: " +executarOpera��o(divisao, 4, 2));
	}
	
	public static Integer executarOpera��o(Calculo calculo, Integer a, Integer b) {
		return calculo.calcular(a, b);
	}
}
