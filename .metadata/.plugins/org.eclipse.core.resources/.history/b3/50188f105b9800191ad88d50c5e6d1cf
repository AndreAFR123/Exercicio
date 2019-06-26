package OrientacaoObjetos;

public class ContaBanco {
	public int numCB;
	public double saldo;
	public double limite = 100;
	public int numAg;
	public String extrato;
	public AgenciaBanco agencia;

	public ContaBanco(AgenciaBanco agencia) {
		this.agencia = agencia;
	}

	public void transfere(ContaBanco conta, double saldo) {
		conta.saldo = this.saldo;
	}

	public double depositar(double deposita) {
		this.saldo += deposita;
		return this.saldo;
	}

	public double saque(double saque) {
		this.saldo -= saque;
		return saque;
	}

	public double consultaSaldo() {
		return this.saldo;
	}

	public String extrato() {
		extrato = "Saldo: " + this.saldo + "\nLimite: " + this.limite;
		return extrato;
	}
}
