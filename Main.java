package me.guiihpcolusso;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente usuario = new Cliente();
		
		usuario.nome = "Guilherme";
		usuario.sobrenome = "Colusso";
		usuario.username = "guiihcolusso";
		usuario.email = "guiihcolusso@gmail.com";
		usuario.senha = "123456789";
		
		usuario.salario = 20000;
				
		Conta ContaUsuario = new Conta();
		
		ContaUsuario.agencia = 0001;
		ContaUsuario.numero = 22082002;
		
		ContaUsuario.depositar(5000);
		
		ContaUsuario.titular = usuario;
		
		
		//==========================================================================================

		Cliente Cleitin = new Cliente();
		
		Cleitin.nome = "Cleitin";
		Cleitin.sobrenome = "Krai Cleitin";
		Cleitin.username = "KraiCleitin";
		Cleitin.email = "kraicleitin@gmail.com";
		Cleitin.senha = "123456789";
		
		Cleitin.salario = 20000;
				
		Conta ContaCleitin = new Conta();
		
		ContaCleitin.agencia = 0001;
		ContaCleitin.numero = 33092222;
		
		ContaCleitin.depositar(200);
		
		ContaCleitin.titular = Cleitin;
		
		System.out.println(ContaCleitin.PegaSaldo());
		System.out.println(ContaUsuario.PegaSaldo());
		System.out.println("");
		
		if(ContaUsuario.transferir(1000, ContaCleitin)) {
			System.out.println("Transferencia Efetuada com sucesso :)");
		}
		
		System.out.println("");
		System.out.println(ContaCleitin.PegaSaldo());
		System.out.println(ContaUsuario.PegaSaldo());
		
		System.out.println("");
		System.out.println("Cleiitn Gasto os 1000 com Puta e pó");
		System.out.println("Cleitin Morreu :(");
		
	}
	
	

}
