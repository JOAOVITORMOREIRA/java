package cliente;

import java.util.Scanner;

import clientes.model.Clientes;

public class TestaCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, endereco, email, cpf;
		int telefone;
		
		Clientes c1 = new Clientes("João Vitor", "Rua do Ferro", "(11)9.1111-2222", "joaoitagv@gmail.com", "000.111.222-33");
		Clientes c2 = new Clientes("Sabrina", "Rua do Niquel", "(11)9.3333-4444", "sabrinasas@gmail.com", "444.555.666-77");
		
		c1.visualizar();
		c2.visualizar();

	}

}
