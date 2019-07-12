package teste.polimorfismo;

import polimorfismo.Conta;

public class TesteExtrato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta();
		
		c.setNome("André");
		c.setSalario(3000);
		
		c.geraExtrato();
		
	}
}