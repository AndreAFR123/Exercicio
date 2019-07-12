package OrientacaoObjetos;

public class Aluno {
	private String nome;
	private String dataNasc;
	private double numRG;
	private Turma turma;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public double getNumRG() {
		return numRG;
	}
	public void setNumRG(double numRG) {
		this.numRG = numRG;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
