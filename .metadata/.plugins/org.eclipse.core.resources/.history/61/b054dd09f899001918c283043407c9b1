package array;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double nota[] = new double[4];
		double media = 0.0;
		String continuar = "sim";
		while (continuar.equalsIgnoreCase("sim")) {
			for (int i = 0; i < nota.length; i++) {
				nota[i] = Teclado.lerDouble("digite a nota numero " + (i+1) + " do aluno: ");
				media += nota[i];
			}
			media /= 4;
			if(media < 5) {
				System.out.println("o aluno foi reprovado com a media de: " + media);
			}
			else {
				System.out.println("aluno foi aprovado com a media de: " + media);
			}
			continuar = Teclado.lerTexto("deseja continuar (sim/nao) ? ");
		}
	}
}
