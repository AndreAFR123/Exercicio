package teste;

import java.util.Arrays;

public class Array {

	public static void imprimeArray(int[] numeros2) {
		for (int numero : numeros2) {
			System.out.println(numero);
		}
	}
	
	public static void main(String[] args) {
		
		
		int[] numeros1 = new int[100];
		int[] numeros2 = new int[] {100, 87};

		System.out.println(numeros1[0]);
		System.out.println(numeros1[1]);
		
		imprimeArray(numeros2);
		
		String[] nomes = new String[]{"Rosemann","Felipe","Andre"};
		
		Arrays.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
}