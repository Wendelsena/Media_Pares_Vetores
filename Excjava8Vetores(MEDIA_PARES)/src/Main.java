import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor?: ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		double mediapares = 0;
		int quantidadePares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				mediapares += vect[i];
				quantidadePares++; // Incrementa a quantidade de números pares
			}
		}

		if (quantidadePares != 0) {
			mediapares /= quantidadePares; // Calcula a média dividindo pela quantidade de números pares
			System.out.println("MEDIA DOS PARES: " + mediapares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}
}
