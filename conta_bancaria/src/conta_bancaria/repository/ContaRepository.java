package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {
	
	//CRUD de Conta
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void detelar(int numero);
	
	//Metodos Bancarios
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem,int numeroDestino, float valor);

}
