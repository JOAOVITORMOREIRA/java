package exercicios_02;

import java.util.Scanner;

public class ExercicioLacoCondicional04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float preco;
		int produto;
		int quantidade;
		
		System.out.println("produto");
        System.out.println("1\tCachorro Quente: R$ 10.00");
        System.out.println("2\tX-Salada: R$ 15.00");
        System.out.println("3\tX-Bacon: R$ 18.00");
        System.out.println("4\tBauru: R$ 12.00");
        System.out.println("5\tRefrigerante: R$ 8.00");
        System.out.println("6\tSuco de laranja: R$ 13.00\n\n");
        
        System.out.println("Digite o codigo do produto: ");
        produto = leia.nextInt();
        
        System.out.println();
        
        System.out.println("Digite a quantidade: ");
        quantidade = leia.nextInt();
        
        switch(produto) {
        case 1:
        	System.out.println("O valor do produto é: " + (preco = 10 * quantidade));
        	break;
        case 2:
        	System.out.println("O valor do produto é: " + (preco = 15 * quantidade));
        	break;
        case 3:
        	System.out.println("O valor do produto é: " + (preco = 18 * quantidade));
        	break;
        case 4:
        	System.out.println("O valor do produto é: " + (preco = 19 * quantidade));
        	break;
        case 5:
        	System.out.println("O valor do produto é: " + (preco = 8 * quantidade));
        	break;
        case 6:
        	System.out.println("O valor do produto é: " + (preco = 13 * quantidade));
        	break;
        default:
        	if (produto >= 7)
        		System.out.println("Produto Invalido");
        		
        	
        	System.out.println("Valor Total: ");
        	
        }
        
        

	}

}
