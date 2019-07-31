package interfaces;

public interface IConta {
	public int getNum();

	public void setNum(int numCB);

	public double getSaldo() ;

	public void setSaldo(double saldo);

	public double deposita(double deposita);

	public double saque(double saque);

	public String extrato();
}
