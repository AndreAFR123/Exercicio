package br.com.lista1;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, num4, num5, maior, menor;
		num1 = Teclado.lerInt("Digite um numero: ");
		num2 = Teclado.lerInt("Digite um numero: ");
		num3 = Teclado.lerInt("Digite um numero: ");
		num4 = Teclado.lerInt("Digite um numero: ");
		num5 = Teclado.lerInt("Digite um numero: ");
		
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			maior = num1;
		} else if(num2 > num3 && num2 > num4 && num2 > num5) {
			maior = num2;
		} else if(num3 > num4 && num3 > num5) {
			maior = num3;
		} else if(num4 > num5) {
			maior = num4;
		} else {
			maior = num5;
		}
		
		if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			menor = num1;
		} else if(num2 < num3 && num2 < num4 && num2 < num5) {
			menor = num2;
		} else if(num3 < num4 && num3 < num5) {
			menor = num3;
		} else if(num4 < num5) {
			menor = num4;
		} else {
			menor= num5;
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}