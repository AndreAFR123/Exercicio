package classes_abstratas;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(1000.0);
		cp.setNum(123);
		System.out.println(cp.extratoDetalhado());
	}
}