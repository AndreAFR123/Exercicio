package OrientacaoObjetos;

public class Gerente {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double aumentoPerc() {
		return this.salario *= 1.1;
	}
	
	public double aumentoVar(double perc) {
		return this.salario *= perc;
	}
}
