package TesteClasse;

import OrientacaoObjetos.AgenciaBanco;
import OrientacaoObjetos.CartaoCredito;
import OrientacaoObjetos.Cliente;
import OrientacaoObjetos.ContaBanco;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgenciaBanco ab1 = new AgenciaBanco(1);
		ab1.num = 123;
		System.out.println("NumeroAgencia: " + ab1.num);
		System.out.println("-----------------------");
		
		AgenciaBanco ab2 = new AgenciaBanco(2);
		ab2.num = 400;
		System.out.println("NumeroAgencia: " + ab2.num);
		System.out.println("-----------------------");
		
		ContaBanco cb1 = new ContaBanco(ab2);
		cb1.numCB = 150;
		cb1.saldo = 1000;
		cb1.numAg = ab1.num;
		System.out.println("Limite: " + cb1.limite);
		System.out.println("Numero: " + cb1.numCB);
		System.out.println("Saldo: " + cb1.saldo);
		System.out.println("N�mero Agencia: " + cb1.numAg);
		System.out.println("-----------------------");
		
		ContaBanco cb2 = new ContaBanco(ab1);
		cb2.numCB = 150;
		cb2.saldo = 1000;
		cb2.numAg = ab2.num;
		System.out.println("Limite: " + cb2.limite);
		System.out.println("Numero: " + cb2.numCB);
		System.out.println("Saldo: " + cb2.saldo);
		System.out.println("N�mero Agencia: " + cb2.numAg);
		System.out.println("-----------------------");
		
		Cliente c2 = new Cliente();
		c2.idC = 2;
		c2.nome = "Felipe";
		System.out.println("ID: " + c2.idC);
		System.out.println("Nome: " + c2.nome);
		System.out.println("-----------------------");
		
		Cliente c1 = new Cliente();
		c1.idC = 1;
		c1.nome = "Andre";
		System.out.println("ID: " + c2.idC);
		System.out.println("Nome: " + c2.nome);
		System.out.println("-----------------------");
		
		CartaoCredito cc1 = new CartaoCredito(4);
		cc1.num = 1;
		cc1.validade = 16092002;
		cc1.idCli = c1.idC;
		System.out.println("N�mero Cartao: " + cc1.num);
		System.out.println("Validade: " + cc1.validade);
		System.out.println("ID Cliente: " + cc1.idCli);
		System.out.println("-----------------------");
		
		CartaoCredito cc2 = new CartaoCredito(5);
		cc2.num = 1;
		cc2.validade = 16092002;
		cc2.idCli = c2.idC;
		System.out.println("Numero Cartao: " + cc2.num);
		System.out.println("Validade: " + cc2.validade);
		System.out.println("ID Cliente: " + cc2.idCli);
		System.out.println("-----------------------");
		
	}
}