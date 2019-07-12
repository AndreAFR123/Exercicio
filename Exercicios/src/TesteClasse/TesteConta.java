package TesteClasse;

import OrientacaoObjetos.AgenciaBanco;
import OrientacaoObjetos.ContaBanco;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgenciaBanco ag = new AgenciaBanco(4);
		ContaBanco cb = new ContaBanco(ag, 0);
		
		System.out.println("Depósito: " + cb.depositar(5000));
		System.out.println("Saque: " + cb.saque(1000));
		System.out.println("Consulta Saldo: " + cb.consultaSaldo());
		System.out.println("Saque: " + cb.saque(500));
		System.out.println(cb.extrato());
	}
}