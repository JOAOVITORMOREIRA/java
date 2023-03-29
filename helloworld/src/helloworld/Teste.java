package helloworld;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		
		
		input.close();

	}

}
