package exercicios_02;

import java.util.Scanner;

public class ExercicioLacoCondicional01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroA, numeroB, numeroC;
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		numeroC = leia.nextInt();
		
		if ((numeroA + numeroB) > numeroC)
			System.out.println("A soma de A + B é Maior que C");
		else if ((numeroA + numeroB) < numeroC)
			System.out.println("A soma de A + B é Menor que C");
		else if  ((numeroA + numeroB) == numeroC)
			System.out.println("A soma de A + B é Igual a C");

	}
	
}
