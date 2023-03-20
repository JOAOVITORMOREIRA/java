package exercicios_04;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int numero;

        int vetorInt[]={2,5,1,3,4,9,7,8,10,6};

        Arrays.sort(vetorInt);
        
        System.out.println("Digite o número que você deseja encontrar: ");
        numero = leia.nextInt();

        for (int contador = 0; contador < vetorInt.length; contador ++) {
            if (vetorInt[contador] == numero) {
                System.out.println("O numero" + numero + "esta na posição [" + contador +"]:");

            }
            if (numero >= 10) {

                System.out.println("Número " + numero + " não encontrado!");
                break;

            }
        }
    }
}
