package teste.polimorfismo;

import polimorfismo.Gerente;
import polimorfismo.Telefonista;

public class TesteControlePonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		g1.setNomeFunc("Alicio");
		System.out.println("Nome: " + g1.getNomeFunc());
		System.out.println(g1.entradaFunc());
		System.out.println(g1.saidaFunc());
		
		Telefonista t1 = new Telefonista();
		t1.setNomeFunc("Amanda");
		System.out.println("Nome: " + t1.getNomeFunc());
		System.out.println(t1.entradaFunc());
		System.out.println(t1.saidaFunc());
		
	}
}