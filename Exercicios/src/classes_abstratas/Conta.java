package classes_abstratas;

public abstract class Conta {
	
	private double saldo = 0.0;
	private int num = 0;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	abstract public String extratoDetalhado();
}
