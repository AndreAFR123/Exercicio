package TesteClasse;

import OrientacaoObjetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Alicio";
		f1.salario = 10000;
		System.out.println("Nome: " + f1.nome);
		System.out.println("Salario: " + f1.salario);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Alicio";
		f2.salario = 10000;
		System.out.println("Nome: " + f2.nome);
		System.out.println("Salario: " + f2.salario);
		
		System.out.println("Aumento: " + f1.aumentaSal(500));
		System.out.println("-----Consulta-----");
		f1.consultaDado();
	}
}