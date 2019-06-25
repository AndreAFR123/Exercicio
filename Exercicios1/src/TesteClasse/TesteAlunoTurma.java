package TesteClasse;

import OrientacaoObjetos.Aluno;
import OrientacaoObjetos.Turma;

public class TesteAlunoTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma t1 = new Turma();
		t1.ensino = "Tecnico";
		t1.periodo = "Noturno";
		t1.serie = 1;
		t1.sigla = "A";
		System.out.println("Ensino: " + t1.ensino);
		System.out.println("Periodo: " + t1.periodo);
		
		Aluno al = new Aluno();
		al.nome = "Felipe";
		al.numRG = 1231231233;
		al.dataNasc = "16/09/2002";
		al.turma = t1;
		System.out.println("Nome: " + al.nome);
		System.out.println("RG: " + al.numRG);
		System.out.println("Data Nasc: " + al.dataNasc);	
		System.out.println("Ensino: " + al.turma.ensino);
		System.out.println("Periodo: " + al.turma.periodo);
		System.out.println("S�rie: " + al.turma.serie);
		System.out.println("Sigla: " + al.turma.sigla);
		
	}
}