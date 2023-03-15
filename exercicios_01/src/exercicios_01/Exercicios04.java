package exercicios_01;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Número 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Número 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Número 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Número 4: ");
		n4 = leia.nextFloat();
		
		System.out.println("Diferença: " + ((n1 * n2)-(n3 * n4)));

	}

}
