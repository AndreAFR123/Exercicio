package br.com.lista1;

import br.com.util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		num1 = Teclado.lerInt("Digite um numero: ");
		num2 = Teclado.lerInt("Digite outro numero: ");
		
		if(num2 % num1 == 0) {
			System.out.println("Divisivel!");
		} else {
			System.out.println("Não Divisivel!");
		}
		
	}
}