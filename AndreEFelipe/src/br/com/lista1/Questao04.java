package br.com.lista1;

import br.com.util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Teclado.lerInt("Digite um numero: ");
		
		if(num % 4 == 0 && num % 5 == 0) {
			System.out.println(num);
		} else {
			System.out.println("Nao divisivel por 4 ou 5");
		}
		
	}

}
