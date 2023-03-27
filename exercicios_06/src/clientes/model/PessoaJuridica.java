package clientes.model;

public class PessoaJuridica extends Clientes{
	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String telefone, String email, String cpf, String cnpj) {
		super(nome, endereco, telefone, email, cpf);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Cnpj: " + this.cnpj);
	}

}
