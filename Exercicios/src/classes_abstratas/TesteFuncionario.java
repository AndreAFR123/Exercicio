package classes_abstratas;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente f = new Gerente();
		f.setNome("Andre");
		f.setSalario(10000.00);
		System.out.println("Bonificacao: " + f.bonificaFunc());
	}
}