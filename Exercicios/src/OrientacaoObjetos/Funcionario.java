package OrientacaoObjetos;

public class Funcionario {
	private String nome;
	private double salario = 1000;
	private static double valeRefei;
	private double bonifica;

	public double getBonifica() {
		return bonifica;
	}

	public void setBonifica(double bonifica) {
		this.bonifica = bonifica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getValeRefei() {
		return valeRefei;
	}

	public static void setValeRefei(double valeRefei) {
		Funcionario.valeRefei = valeRefei;
	}

	public double aumentaSal(double aumento) {
		this.salario += aumento;
		return aumento;
	}

	public static double reajusteVale() {
		Funcionario.setValeRefei(Funcionario.valeRefei += Funcionario.valeRefei * 0.1) ;
		return getValeRefei();
	}

	public void consultaDado() {
		System.out.printf("Nome: %s \nSal�rio: %.1f \nBonifica��o: %.1f", this.nome, this.salario, this.bonifica);
	}
	
	public double calculaBonificacao() {
		setBonifica(salario += salario * 0.1);
		return getBonifica();
	}
}