package br.com.lista1;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, dif;
		num1 = Teclado.lerInt("Digite um Numero: ");
		num2 = Teclado.lerInt("Digite outro Numero: ");
		
		if(num1 < num2) {
			dif = num2 - num1;
			System.out.println(dif);
		} else {
			dif = num1 - num2;
			System.out.println(dif);
		}
	}
}