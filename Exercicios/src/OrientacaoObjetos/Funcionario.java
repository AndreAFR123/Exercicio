package OrientacaoObjetos;

public class Funcionario {
	public String nome;
	public double salario = 1000;
	
	public double aumentaSal(double aumento) {
		this.salario += aumento;
		return aumento;
	}
	
	public void consultaDado() {
		System.out.printf("Nome: %s \nSal�rio: %.1f ", this.nome, this.salario);
	}
}