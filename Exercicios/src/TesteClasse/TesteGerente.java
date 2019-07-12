package TesteClasse;

import OrientacaoObjetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		g1.setSalario(1000);
		System.out.println("Aumento 10: " + g1.aumentoPerc());
		System.out.println("Aumento Var: " + g1.aumentoVar(1.2));
	}
}