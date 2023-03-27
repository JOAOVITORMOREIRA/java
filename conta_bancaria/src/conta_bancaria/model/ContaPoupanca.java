package conta_bancaria.model;

public class ContaPoupanca extends Conta{
	
	private int aniversario;

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public ContaPoupanca(int numero, int agencia, int tipo, String tilular, float saldo, int aniversario) {
		super(numero, agencia, tipo, tilular, saldo);
		this.aniversario = aniversario;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversario da Conta: " + this.aniversario);
	}

}
