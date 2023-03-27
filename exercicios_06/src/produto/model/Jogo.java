package produto.model;

import java.time.LocalDate;

public class Jogo extends Produto{
	
	private String criador;

	public Jogo(int id, String nome, int versao, String produtora, LocalDate lancamento, float preco, String criador) {
		super(id, nome, versao, produtora, lancamento, preco);
		this.criador = criador;
	}

	public String getCriador() {
		return criador;
	}

	public void setCriador(String criador) {
		this.criador = criador;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Criador do Jogo: " + this.criador);
		
	}

}
