package exercicios_03;

import java.util.Scanner;

public class ExercicioLacoDeRepeticao02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int idade = 0, maiores50 = 0, menores21 = 0;

            while(idade >= 0) {
                System.out.println("Digite a sua idade: ");
                idade = leia.nextInt();

                if(idade > 50)
                    maiores50++;
                if(idade < 21 && idade > 0)
                    menores21++;
            }

            System.out.println("Total de pessoas menores de 21 anos: "+ menores21);
            System.out.println("Total de pessoas maiores de 50 anos: "+ maiores50);
    }

}

