package exercicios_01;

import java.util.Scanner;

public class Exercicios02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Nota 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Nota 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Nota 4: ");
		n4 = leia.nextFloat();
		
		System.out.println("Média Final: " + (n1 + n2 + n3 + n4)/4);

	}

}
