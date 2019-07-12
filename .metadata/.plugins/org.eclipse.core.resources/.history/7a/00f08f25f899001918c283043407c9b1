package arraylernum;

public class Questao12 {

	public static void main(String[] args) {
		int cont = 0 , continuar = 0;
		double media = 0.0;
		double num = 0 , menor = 0 , maior = 0;
			while (num != -1) {
				num = Teclado.lerInt("digite um numero ");
					if (num == -1) {
						break;
					}
					cont++;
					media += num;
					if (menor == 0 || menor > num) {
						menor = num;
					}
					if (maior < num) {
						maior = num;
					}
			}
		media /= cont ;
		System.out.println("maior numero " + maior);
		System.out.println("menor numero " + menor);
		System.out.println("media dos numeros " + media);
	}
}
