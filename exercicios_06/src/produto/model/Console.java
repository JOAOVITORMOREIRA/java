package produto.model;

import java.time.LocalDate;

public class Console extends Produto{
	
	private String plataforma;

	public Console(int id, String nome, int versao, String produtora, LocalDate lancamento, float preco,
			String plataforma) {
		super(id, nome, versao, produtora, lancamento, preco);
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Plataforma: " + this.plataforma);
	}

}
