package arrays;

import java.util.Scanner;

public class Arrays {

	// 03.11.2020 Susi no hospital... Negão ainda no hospital... Aniversário da
	// Piriquita...

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// int n = input.nextInt();
		// double[] vect = new double[n];

		// for (int i = 0; i < n; i++) {
		// vect[i] = input.nextDouble();
		// }

		// double sum = 0.0;
		// for (int i = 0; i < n; i++) {
		// sum += vect[i];
		// }

		// double avg = sum / n;

		// System.out.printf("AVERAGE HEIGHT %.2f\n", avg);

		int n = input.nextInt();
		Aarrays[] vect = new Aarrays[n];

		for (int i = 0; i < vect.length; i++) { // no lugar da variavel "vector.length" pode-se usar .length
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			vect[i] = new Aarrays(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;
		System.out.printf("AVERAGE PRICE %.2f\n", avg);

		input.close();
	}
}
