package exercicios_02;

import java.util.Scanner;

public class ExercicioLacoCondicional03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2;
		int operacao;
		
		System.out.println("operacao");
        System.out.println("1\tSoma");
        System.out.println("2\tSubtração");
        System.out.println("3\tMultiplicação");
        System.out.println("4\tDivisão\n\n");
		
		System.out.println("Digite o 1° número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2° número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite a operação: ");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("A soma é: " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("A subtração é: " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("A multiplicação é: " + (numero1 * numero2));
			break;
		case 4:
			System.out.println("A divisão é: " + (numero1 / numero2));
			break;
		default:
        	System.out.println("Operação Invalida");
		
		}
		

	}

}
