package clientes.model;

public class PessoaFisica extends Clientes{
	
	private String identidade;

	public PessoaFisica(String nome, String endereco, String telefone, String email, String cpf, String identidade) {
		super(nome, endereco, telefone, email, cpf);
		this.identidade = identidade;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Identidade: " + this.identidade);
	}

}
