package array;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		double numero = 0.0;
		String continuar = "sim";
		while (continuar.equalsIgnoreCase("sim")) {
			numero = Teclado.lerDouble("digite um numero: ");
				if (numero > 20) {
				numero = numero/2;
				System.out.println("numero maior que 20 sera exibido dividido por 2: " + numero);
				}
				else {
					System.out.println("numero sem alteracoes: " + numero);
				}
				continuar = Teclado.lerTexto("deseja continuar (sim/nao) ?");
		}		
	}
}
