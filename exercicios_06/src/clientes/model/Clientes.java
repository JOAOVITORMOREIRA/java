package clientes.model;

public class Clientes {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String cpf;

	public Clientes(String nome, String endereco, String telefone, String email, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {

		System.out.println("*************************************************");
		System.out.println("                 DADOS DO CLIENTE                ");
		System.out.println("*************************************************");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Endereço do cliente:: " + this.endereco);
		System.out.println("Telefone do cliente: " + this.telefone);
		System.out.println("Email do cliente: " + this.email);
		System.out.println("CPF do cliente: " + this.cpf);

	}
}
