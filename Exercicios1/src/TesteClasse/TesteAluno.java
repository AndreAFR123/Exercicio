package TesteClasse;

import OrientacaoObjetos.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno al = new Aluno();
		al.nome = "Felipe";
		al.numRG = 1231231233;
		al.dataNasc = "16/09/2002";
		System.out.println("Nome: " + al.nome);
		System.out.println("RG: " + al.numRG);
		System.out.println("Data Nasc: " + al.dataNasc);
		
		Aluno a2 = new Aluno();
		a2.nome = "Andr�";
		a2.numRG = 321321321;
		a2.dataNasc = "09/02/2000";
		System.out.println("Nome: " + a2.nome);
		System.out.println("RG: " + a2.numRG);
		System.out.println("Data Nasc: " + a2.dataNasc);
	}
}