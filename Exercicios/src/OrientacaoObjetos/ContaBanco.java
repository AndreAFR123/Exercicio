package OrientacaoObjetos;

public class ContaBanco {
	private int numCB;
	private double saldo;
	private double limite = 100;
	private int numAg;
	private String extrato;
	private AgenciaBanco agencia;
	private static int cont = 0;
	private int conta;

	public int getNumCB() {
		return numCB;
	}

	public void setNumCB(int numCB) {
		this.numCB = numCB;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNumAg() {
		return numAg;
	}

	public void setNumAg(int numAg) {
		this.numAg = numAg;
	}

	public String getExtrato() {
		return extrato;
	}

	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}

	public AgenciaBanco getAgencia() {
		return agencia;
	}

	public void setAgencia(AgenciaBanco agencia) {
		this.agencia = agencia;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		ContaBanco.cont = cont;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public ContaBanco(AgenciaBanco agencia, int conta) {
		this.agencia = agencia;
		ContaBanco.cont++;
		this.conta = cont;
}
	
	public static void zeraContador() {
		System.out.println("Objetos Criados: " + cont);
		ContaBanco.cont = 0;
	}

	public void transfere(ContaBanco conta1,ContaBanco conta2, double saldo) {
		conta1.saldo -= saldo;
		conta2.saldo += saldo;
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