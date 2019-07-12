package array;

import br.com.util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		double numero = 0.0;
		String continuar = "sim";
		while (continuar.equalsIgnoreCase("sim")) {
		numero = Teclado.lerDouble("digite um numero positivo ou negativo: ");
			if (numero < 0) {
				numero -= numero + numero;
				System.out.println("numero era negativo mostrando ele positivo: " + numero);
			}
			else {
				System.out.println("numero era positivo mostrando ele normal: " + numero);
			}
			continuar = Teclado.lerTexto("deseja continuar (sim/nao) ? ");
		}
	}
}
