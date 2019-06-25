package TesteClasse;

import OrientacaoObjetos.Funcionario;
import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f = new Funcionario();
		String opcao = "S";
		
		while(opcao.equalsIgnoreCase("S")) {
			f.nome = Teclado.lerTexto("Digite o nome: ");
			f.salario = Teclado.lerDouble("Digite o salario: ");
			
			opcao = Teclado.lerTexto("Deseja alterar nome? \nS ou N");
			
		}

	}
}