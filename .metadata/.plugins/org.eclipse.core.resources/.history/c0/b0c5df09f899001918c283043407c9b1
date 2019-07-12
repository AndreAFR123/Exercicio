package array;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		double numero = 0.0;
		String continuar = "sim";
		while (continuar.equalsIgnoreCase("sim")) {
			numero = Teclado.lerDouble("digite um numero positivo, negativo ou nulo: ");
				if(numero == 0) {
					System.out.println("numero nulo");
				}
				else if (numero > 0) {
					System.out.println("este numero e positivo");
				}
				else {
					System.out.println("este numero e negativo");
				}
				continuar = Teclado.lerTexto("deseja continuar (sim/nao) ? ");
		}
	}
}
