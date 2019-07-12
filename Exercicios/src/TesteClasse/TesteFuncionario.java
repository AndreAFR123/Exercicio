package TesteClasse;

import OrientacaoObjetos.Funcionario;
import OrientacaoObjetos.GerenteFunc;
import OrientacaoObjetos.Secretaria;
import OrientacaoObjetos.Telefonista;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario();
		
		GerenteFunc g1 = new GerenteFunc();
		g1.setNome("Felipe");
		g1.setSalarioGerente(2000);
		g1.setNomeUsuario("Alicio");
		g1.setSenha("123");
		g1.setSalarioGerente(1000);
		g1.calculaBonificacao();
		
		Telefonista t1 = new Telefonista();
		t1.setNome("Alice");
		t1.setSalario(1000);
		t1.setIdEstacaoTrab(1);
		t1.calculaBonificacao();
		
		Secretaria s1 = new Secretaria();
		s1.setNome("Aline");
		s1.setSalario(1500);
		s1.setNumRamal(123);
		s1.calculaBonificacao();
		
		t1.setIdEstacaoTrab(1);
		s1.setNumRamal(1223);
		f1.setNome("Alicio");
		f1.setSalario(1000);
		System.out.println("Bonificação Gerente: " + g1.calculaBonificacao());
		Funcionario.setValeRefei(300);
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Vale Refeição: " + Funcionario.getValeRefei());
		System.out.println("Reajuste: " + Funcionario.reajusteVale());
		System.out.println("Bonificação: " + f1.calculaBonificacao());
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Felipe");
		f2.setSalario(10000);
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Salario: " + f2.getSalario());
		System.out.println("Bonificação: " + f2.calculaBonificacao());
		
		System.out.println("\nAumento: " + f1.aumentaSal(500));
		System.out.println("-----Consulta-----");
		f1.consultaDado();
		g1.consultaDado();
		t1.consultaDado();
		s1.consultaDado();
		
	}
}