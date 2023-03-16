package exercicios_02;

import java.util.Scanner;

public class ExercicioLacoCondicional02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean sangue = false;
		char doacao;
	
		System.out.println("Digite o Nome do Doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do Doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		leia.skip("\\R?");
		doacao = leia.nextLine().charAt(0);
		
		if (doacao == 's')
			sangue = true;
		
		if (idade >= 60 && idade <= 69) {
			if(sangue)
				System.out.println(nome + " Não está apto a doar!");
			else 
				System.out.println(nome + " Está apto a doar!");
			
		}else if (idade < 18 || idade > 69)
			System.out.println(nome + " Não está apto a doar!");
		else
			System.out.println(nome + " Está apto a doar!");
	}

}
