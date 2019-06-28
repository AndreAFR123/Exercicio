package br.com.lista1;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c;
		a = Teclado.lerDouble("Digite um valor: ");
		b = Teclado.lerDouble("Digite um valor: ");
		c = Teclado.lerDouble("Digite um valor: ");

		if (a < b && a < c) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		}
		if (b < a && b < c) {
			System.out.println(b);
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			}
		}
		if (c < b && c < a) {
			System.out.println(c);
			if (b < a) {
				System.out.println(b);
				System.out.println(a);
			} else {
				System.out.println(a);
				System.out.println(b);
			}
		}
	}
}