package exercicios_04;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		int somaP = 0, somaS = 0;
		String diagonalP = "", diagonalS = "";
		
		for (int iLinha = 0; iLinha < matriz.length; iLinha ++) {
			for (int iColuna = 0; iColuna < matriz.length; iColuna ++) {
				
				System.out.println("Digite um número: ");
				matriz[iLinha][iColuna] = leia.nextInt();
				
			}
		}
		
		for (int iLinha = 0; iLinha < matriz.length; iLinha ++){
			diagonalP += matriz[iLinha][iLinha] + " ";
			somaP += matriz[iLinha][iLinha];
			
			diagonalS += matriz[iLinha][matriz.length - 1- iLinha] + " ";
			somaS += matriz[iLinha][matriz.length - 1- iLinha];
		}
		
		System.out.println("Elementos da Diagonal Principal:\n:");
		System.out.println(diagonalP);
		
		System.out.println("Elementos da Diagonal Secundária:\n:");
		System.out.println(diagonalS);
		
		System.out.println("Soma dos Elementos da Diagonal Principal:\n:");
		System.out.println(somaP);
		
		System.out.println("Soma dos Elementos da Diagonal Secundária:\n:");
		System.out.println(somaS);
		
	}

}
