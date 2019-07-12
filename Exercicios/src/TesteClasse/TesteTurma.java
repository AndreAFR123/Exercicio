package TesteClasse;

import OrientacaoObjetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma t1 = new Turma();
		t1.setEnsino("Tecnico");
		t1.setPeriodo("Noturno");
		t1.setSerie(1);
		t1.setSigla("A");
		System.out.println("Ensino: " + t1.getEnsino());
		System.out.println("Periodo: " + t1.getPeriodo());
		
		Turma t2 = new Turma();
		t2.setEnsino("Padrao");
		t2.setPeriodo("Tarde");
		t2.setSerie(3);
		t2.setSigla("INFEM");
		System.out.println("Ensino: " + t2.getEnsino());
		System.out.println("Periodo: " + t2.getPeriodo());
		
	}
}