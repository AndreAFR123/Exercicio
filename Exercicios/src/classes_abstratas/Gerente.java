package classes_abstratas;

public class Gerente extends Funcionario{
	
	@Override
	public double bonificaFunc() {
		this.setSalario(this.getSalario() + 200);
		return getSalario();
	}
}