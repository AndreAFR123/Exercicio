package TesteClasse;

import OrientacaoObjetos.AgenciaBanco;
import OrientacaoObjetos.CartaoCredito;
import OrientacaoObjetos.Cliente;
import OrientacaoObjetos.ContaBanco;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgenciaBanco ab1 = new AgenciaBanco(1);
		ab1.setNum(123);
		System.out.println("NumeroAgencia: " + ab1.getNum());
		System.out.println("-----------------------");
		
		AgenciaBanco ab2 = new AgenciaBanco(2);
		ab2.setNum(400);
		System.out.println("NumeroAgencia: " + ab2.getNum());
		System.out.println("-----------------------");
		
		System.out.println("Contador de Objeto: " + ContaBanco.getCont());
		ContaBanco cb1 = new ContaBanco(ab2, ContaBanco.getCont());
		
		System.out.println("Contador de Objeto: " + ContaBanco.getCont());
		System.out.println("NumConta1: " + cb1.getConta());
		
		ContaBanco cb2 = new ContaBanco(ab1, ContaBanco.getCont());
		System.out.println("Contador de Objeto: " + ContaBanco.getCont());
		System.out.println("NumConta1: " + cb1.getConta());
		System.out.println("NumConta2: " + cb2.getConta());

		ContaBanco.zeraContador();
		
		System.out.println("Contador de Objeto: " + ContaBanco.getCont());

		cb1.setNumCB(150);
		cb1.setSaldo(1000);
		cb1.setNumAg(ab1.getNum());
		System.out.println("Limite: " + cb1.getLimite());
		System.out.println("Numero: " + cb1.getNumCB());
		System.out.println("Saldo: " + cb1.getSaldo());
		System.out.println("Número Agencia: " + cb1.getNumAg());
		System.out.println("-----------------------");
		
		cb2.setNumAg(150);
		cb2.setSaldo(1000);
		cb2.setNumAg(ab2.getNum());
		cb2.transfere(cb1, cb2, 1500);
		System.out.println("Limite: " + cb2.getLimite());
		System.out.println("Numero: " + cb2.getNumCB());
		System.out.println("Saldo: " + cb2.getSaldo());
		System.out.println("Número Agencia: " + cb2.getNumAg());
		System.out.println("-----------------------");
		
		System.out.println("-----------------------");
		System.out.println("Saldo 1: " + cb1.getSaldo());
		System.out.println("Saldo 2: " + cb2.getSaldo());
		System.out.println("-----------------------");
		
		Cliente c2 = new Cliente();
		c2.setIdC(2);
		c2.setNome("Felipe");
		System.out.println("ID: " + c2.getIdC());
		System.out.println("Nome: " + c2.getNome());
		System.out.println("-----------------------");
		
		Cliente c1 = new Cliente();
		c1.setIdC(1);
		c1.setNome("Andre");
		System.out.println("ID: " + c2.getIdC());
		System.out.println("Nome: " + c2.getNome());
		System.out.println("-----------------------");
		
		CartaoCredito cc1 = new CartaoCredito(4);
		cc1.setNum(1);
		cc1.setValidade(16092002);
		cc1.setIdCli(c1.getIdC());
		System.out.println("Número Cartao: " + cc1.getNum());
		System.out.println("Validade: " + cc1.getValidade());
		System.out.println("ID Cliente: " + cc1.getIdCli());
		System.out.println("-----------------------");
		
		CartaoCredito cc2 = new CartaoCredito(5);
		cc2.setNum(1);
		cc2.setValidade(16092002);
		cc2.setIdCli(c2.getIdC());
		System.out.println("Numero Cartao: " + cc2.getNum());
		System.out.println("Validade: " + cc2.getValidade());
		System.out.println("ID Cliente: " + cc2.getIdCli());
		System.out.println("-----------------------");
		
	}
}