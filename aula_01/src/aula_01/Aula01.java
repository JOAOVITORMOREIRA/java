package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma: " + df.format((numero1 + numero2)));
		System.out.println("Subitração: " + df.format((numero1 - numero2)));
		System.out.println("Multiplicação: " + df.format((numero1 * numero2)));
		
		if (numero1 != 0 && numero2 !=0) {
			System.out.println("Divisao: " + df.format((numero1 / numero2)));
		}else {
			System.out.println("Não exixte divisao por zero!");
		}
		
		System.out.println("Potência: " + df.format(Math.pow(numero1, numero2)));
		System.out.println("Raiz Quadrada: " + df.format(Math.sqrt(numero1)));
		
		System.out.println("Nome: " + nome);
		
		leia.close();

	}

}
