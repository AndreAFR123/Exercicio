package TesteClasse;

import OrientacaoObjetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma t1 = new Turma();
		t1.ensino = "Tecnico";
		t1.periodo = "Noturno";
		t1.serie = 1;
		t1.sigla = "A";
		System.out.println("Ensino: " + t1.ensino);
		System.out.println("Periodo: " + t1.periodo);
		
		Turma t2 = new Turma();
		t2.ensino = "Padrao";
		t2.periodo = "Tarde";
		t2.serie = 3;
		t2.sigla = "INFEM";
		System.out.println("Ensino: " + t2.ensino);
		System.out.println("Periodo: " + t2.periodo);
		
	}
}