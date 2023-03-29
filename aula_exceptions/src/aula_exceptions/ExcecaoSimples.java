package aula_exceptions;

public class ExcecaoSimples extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExcecaoSimples() {}
	//polimorfismo de sobrecarga
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}

}
