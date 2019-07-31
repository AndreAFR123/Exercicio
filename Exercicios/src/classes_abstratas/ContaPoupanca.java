package classes_abstratas;

public class ContaPoupanca extends Conta{
	
	@Override
	public String extratoDetalhado() {
		String extrato = "Numero: " + getNum() + "\nSaldo: " + getSaldo();
		return extrato;
	}
}