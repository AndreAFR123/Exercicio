package OrientacaoObjetos;

public class Telefonista extends Funcionario{

	private int idEstacaoTrab;

	public int getIdEstacaoTrab() {
		return idEstacaoTrab;
	}

	public void setIdEstacaoTrab(int idEstacaoTrab) {
		this.idEstacaoTrab = idEstacaoTrab;
	}
	
	public void consultaDado() {
		System.out.printf("\nNome: %s \nSal�rio: %.1f \nBonifica��o: %.1f \nEsta��o Trabalho: %d", 
				getNome(), getSalario(), getBonifica(), getIdEstacaoTrab());
	}	
}