package com.marlonfrazao.main;

public class Program {

	public static void main(String[] args) {
		Calculo soma = (a, b) -> a + b;		
		System.out.println("Retorna soma 4 + 2: " +executarOperacao(soma, 4, 2));
		
		Calculo subtracao = (a, b) -> a - b;
		System.out.println("Retorna subtração 4 - 2: " +executarOperacao(subtracao, 4, 2));
		
		Calculo multiplicacao = (a, b) -> a * b;
		System.out.println("Retorna multiplicação 4 * 2: " +executarOperacao(multiplicacao, 4, 2));
		
		Calculo divisao = (a, b) -> a / b;
		System.out.println("Retorna divisão 4 / 2: " +executarOperacao(divisao, 4, 2));
	}
	
	public static Integer executarOperacao(Calculo calculo, Integer a, Integer b) {
		return calculo.calcular(a, b);
	}
}
