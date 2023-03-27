package cliente;

import clientes.model.Clientes;
import clientes.model.PessoaFisica;
import clientes.model.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		
		Clientes c1 = new Clientes("João Vitor", "Rua do Ferro", "(11)9.1111-2222", "joaoitagv@gmail.com", "000.111.222-33");
		Clientes c2 = new Clientes("Sabrina", "Rua do Niquel", "(11)9.3333-4444", "sabrinasas@gmail.com", "444.555.666-77");
		
		c1.visualizar();
		c2.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica("João Vitor", "Rua do Ferro", "(11)9.1111-2222", "joaoitagv@gmail.com", "000.111.222-33", "11.222.444-5");
		PessoaFisica pf2 = new PessoaFisica("Sabrina", "Rua do Niquel", "(11)9.3333-4444", "sabrinasas@gmail.com", "444.555.666-77","22.333.555-6");
		
		pf1.visualizar();
		pf2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica("João Vitor", "Rua do Ferro", "(11)9.1111-2222", "joaoitagv@gmail.com", "000.111.222-33", "00.000.000/0001-23");
		PessoaJuridica pj2 = new PessoaJuridica("Sabrina", "Rua do Niquel", "(11)9.3333-4444", "sabrinasas@gmail.com", "444.555.666-77","11.111.111/0001-12");
		
		pj1.visualizar();
		pj2.visualizar();

	}

}
