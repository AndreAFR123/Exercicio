package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] num = new int[] { 100, 95, 150 };
		int soma = 0, media = 0, maior = 0;
		Arrays.sort(num);

		for (int numeros : num) {
			System.out.println(numeros);
			if (numeros > maior) {
				maior = numeros;
			}
			soma += numeros;
		}

		media = soma / num.length;
		System.out.println("Media: " + media);
		System.out.println("Maior: " + maior);
	}
}