package br.com.lista1;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Teclado.lerInt("Digite um numero inteiro: ");

		if (num >= 1 && num <= 10) {
			System.out.println("Entre 1 e 10");
		} else {
			System.out.println("Fora da Faixa!");
		}
	}
}