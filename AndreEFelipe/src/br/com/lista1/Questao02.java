package br.com.lista1;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cap = Teclado.lerTexto("Digite a capital do Brasil: ");
		
		if(cap.equalsIgnoreCase("Distrito Federal")) {
			System.out.println("Certo");
		} else {
			System.out.println("Errado");
		}
	}
}