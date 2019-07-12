package OrientacaoObjetos;

public class Secretaria extends Funcionario{

	private int numRamal;

	public int getNumRamal() {
		return numRamal;
	}

	public void setNumRamal(int numRamal) {
		this.numRamal = numRamal;
	}
	
	public void consultaDado() {
		System.out.printf("\nNome: %s \nSalário: %.1f \nBonificação: %.1f \nNumero Ramal: %d", 
				getNome(), getSalario(), getBonifica(), getNumRamal());
	}
}
