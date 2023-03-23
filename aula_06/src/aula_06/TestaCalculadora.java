package aula_06;

import java.util.Scanner;

import aula_06.calculos.Calculos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Calculos calc = new Calculos();
		//classe instaciada
	
		
		int opcao;
		double num1, num2;
		
		while(true) {
			
			System.out.println("1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Multiplicação");
			System.out.println("4-Divisão");
			
			System.out.println("Qual a operação?");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				sobre();
				leia.close();
				System.exit(0);
			}
			
			System.out.println("Digite o 1º número: ");
			num1 = leia.nextDouble();
			
			System.out.println("Digite o 2º número: ");
			num2 = leia.nextDouble();
			
			switch(opcao) {
			case 1 -> System.out.println("Soma: " + calc.soma(num1, num2));
			case 2 -> System.out.println("Subtração: " + calc.subitracao(num1, num2));
			case 3 -> System.out.println("Multiplicação: " + calc.multiplicacao(num1, num2));
			case 4 -> System.out.println("Divisão: " + calc.divisao(num1, num2));
			default -> System.out.println("Opção Invalida!");
			
			}
			
		}
		
		
	}
	
	public static void sobre () {
		System.out.println("Calculadora com Métodos");
		System.out.println("João Vitor Moreira");
	}

}
