package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Sabrina", 100000.00f,1000.00f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(3, 234, 2, "Valeria", 100000.00f, 15);
		cp1.visualizar();
		
		cp1.sacar(1000.00f);
		cp1.visualizar();
		
		cp1.depositar(5000.00f);
		cp1.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "*************************************************");
			System.out.println("                                                 ");
			System.out.println("               BANCO DO JOAO                     ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("              1-Criar Conta                      ");
			System.out.println("              2-Listar Todas as Contas           ");
			System.out.println("              3-Buscar Conta por Numero          ");
			System.out.println("              4-Atualizar Dados da Conta         ");
			System.out.println("              5-Apagar Conta                     ");
			System.out.println("              6-Sacar                            ");
			System.out.println("              7-Depositar                        ");
			System.out.println("              8-Transferir Valores Entre Contas  ");
			System.out.println("              9-Sair                             ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("Entre com a opção desejada:                      ");
			System.out.println("                                                 " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do João - Aqui o dinheiro é na sua mão");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1 -> {
				System.out.println("Criar Conta\n\n");

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca
				}
				}
			}

			case 2 -> {
				System.out.println("Listar Todas as Contas\n\n");
			}
			case 3 -> {
				System.out.println("Buscar Conta por Numero \n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 4 -> {
				System.out.println("Atualizar Dados da Conta\n\n");
				
				System.out.println("Digite o número da conta: ");
                numero = leia.nextInt();

                tipo = 1;
                // condicional buscar na collection

                System.out.println("Digite o Numero da Agência: ");
                agencia = leia.nextInt();
                
                System.out.println("Digite o Nome do Titular: ");
                leia.skip("\\R?");
                titular = leia.nextLine();

                System.out.println("Digite o Saldo da Conta (R$): ");
                saldo = leia.nextFloat();

                // retornar tipo

                switch (tipo) {
                case 1 -> {
                    System.out.println("Digite o Limite de Crédito (R$): ");
                    limite = leia.nextFloat();

                    // criar o objeto conta corrente
                }
                case 2 -> {
                    System.out.println("Digite o dia do Aniversario da Conta: ");
                    aniversario = leia.nextInt();

                    // criar o objeto conta poupanca

                }
                default -> {
                    System.out.println("Tipo de conta inválido!");
                }
                }

                // fim do condicional buscar na collection
			}
			case 5 -> {
				System.out.println("Apagar Conta\n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Sacar\n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				System.out.println("Digite o valor do saque: ");
				valor = leia.nextFloat();
			}
			case 7 -> {
				System.out.println("Depositar\n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 8 -> {
				System.out.println("Transferir Valores Entre Contas\n\n");
				
				System.out.println("Digite o Numero da Conta de Origem: ");
                numero = leia.nextInt();
                
                System.out.println("Digite o Numero da Conta de Destino: ");
                numeroDestino = leia.nextInt();

                do {
                    System.out.println("Digite o Valor da Transferência (R$): ");
                    valor = leia.nextFloat();
                    
                } while (valor <= 0);
                
			}
			default -> System.out.println("\nOpção Invalida!\n");

			}

		}

	}
	
	public static void sobre() {
		System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "*************************************************");
		System.out.println("                                                 ");
		System.out.println("   João Vitor Moreira                            ");
		System.out.println("   E-mail: joaoitagv@gmail.com                   ");
		System.out.println("   GitHub: https://github.com/JOAOVITORMOREIRA   ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 " + Cores.TEXT_RESET);
	}
}
