package array;

import br.com.util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		double numero = 0.0;
		String continuar = "sim";
		while (continuar.equalsIgnoreCase("sim")) {
		numero = Teclado.lerDouble("digite um numero: ");
			if (numero % 2 == 0) {
				System.out.println("este numero e par");
			}
			else {
				System.out.println("este numero e impar");
			}
			continuar = Teclado.lerTexto("deseja continuar (sim/nao) ? ");
		}
	}

}
