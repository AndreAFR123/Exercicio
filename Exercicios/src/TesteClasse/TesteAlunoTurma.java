package TesteClasse;

import OrientacaoObjetos.Aluno;
import OrientacaoObjetos.Turma;

public class TesteAlunoTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma t1 = new Turma();
		t1.setEnsino("Tecnico");
		t1.setPeriodo("Noturno");
		t1.setSerie(1);
		t1.setSigla("A");
		System.out.println("Ensino: " + t1.getEnsino());
		System.out.println("Periodo: " + t1.getPeriodo());
		
		Aluno al = new Aluno();
		al.setNome("Felipe");
		al.setNumRG(1231231233);
		al.setDataNasc("16/09/2002");
		al.setTurma(t1);
		System.out.println("Nome: " + al.getNome());
		System.out.println("RG: " + al.getNumRG());
		System.out.println("Data Nasc: " + al.getDataNasc());	
		System.out.println("Ensino: " + al.getTurma().getEnsino());
		System.out.println("Periodo: " + al.getTurma().getPeriodo());
		System.out.println("Série: " + al.getTurma().getSerie());
		System.out.println("Sigla: " + al.getTurma().getSigla());
		
	}
}