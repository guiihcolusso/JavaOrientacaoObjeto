package me.guiihpcolusso;

public class Conta {

	int agencia;
	int numero;
	Cliente titular;
	private double saldo;
	
	
	public boolean transferir(double valor, Conta destino) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			destino.depositar(valor);
			return true;
		}else
			return false;
	}

	public boolean depositar(double valor) {
		saldo = saldo + valor;
		return true;
	}

	public double PegaSaldo() {
		return saldo;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

}
