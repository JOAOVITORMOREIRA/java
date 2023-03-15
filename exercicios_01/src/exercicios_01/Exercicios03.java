package exercicios_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios03 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		
		float sb, an, he, de;
		
		System.out.println("Salário Bruto: ");
		sb = leia.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		an = leia.nextFloat();

		System.out.println("Horas Extras: ");
		he = leia.nextFloat();
		
		System.out.println("Descontos: ");
		de = leia.nextFloat();
		
		System.out.println("Salário Líquido: " +df.format((sb + an + he - de)));
	}

}
