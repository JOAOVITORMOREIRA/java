package exercicios_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.println("Digite o salário:");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = leia.nextFloat();
		
		System.out.println("Novo salário =: " + df.format((salario + abono)));
		

	}

}
