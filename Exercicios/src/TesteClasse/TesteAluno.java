package TesteClasse;

import OrientacaoObjetos.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno al = new Aluno();
		al.setNome("Felipe");
		al.setNumRG(1231231233);
		al.setDataNasc("16/09/2002");
		System.out.println("Nome: " + al.getNome());
		System.out.println("RG: " + al.getNumRG());
		System.out.println("Data Nasc: " + al.getDataNasc());
		
		Aluno a2 = new Aluno();
		a2.setNome("Andre");
		a2.setNumRG(321321321);
		a2.setDataNasc("09/02/2000");
		System.out.println("Nome: " + a2.getNome());
		System.out.println("RG: " + a2.getNumRG());
		System.out.println("Data Nasc: " + a2.getDataNasc());
	}
}