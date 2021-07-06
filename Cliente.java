package me.guiihpcolusso;

public class Cliente {

	String nome;
	String sobrenome;
	String username;
	String email;
	String senha;

	double salario;

	public boolean sacar(double valor) {
		if (salario >= valor) {

			salario = salario - valor;
			return true;
		} else {
			return false;

		}
	}
}
