package interfaces;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente cc = new ContaCorrente();
		cc.setNum(123);
		cc.setSaldo(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setNum(111);
		cp.setSaldo(2500.0);
		
		System.out.println("Deposita: " + cc.deposita(1000.0));
		System.out.println("Saca: " + cc.saque(1000.0));
		System.out.println("\n Corrente \n" + cc.extrato());
		System.out.println("\n Poupanca \n" + cp.extrato());
	}
}