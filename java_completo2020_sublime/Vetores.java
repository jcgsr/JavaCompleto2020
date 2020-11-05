import java.util.Scanner;

public class Vetores {

	// 03.11.2020 Susi no hospital... Negão ainda no hospital... Aniversário da Piriquita...

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		// int n = input.nextInt();
		// Product[] vect = new Product[n];


		// for (int i = 0; i < n; i++) {
		// 	input.nextLine();
		// 	String name = input.nextLine();
		// 	double price = input.nextDouble();
		// 	vect[i] = new Product(name, price);
		// }

		// double sum = 0.0;
		// for (int i = 0; i < n; i++) {
		// 	sum += vect[i].getPrice();
		// }

		// double avg = sum / n;
		// System.out.printf("AVERAGE HEIGHT %.2f\n", avg);


		int n = input.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			vect[i] = input.nextInt();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("AVERAGE HEIGHT %.2f\n", avg);

		input.close();

		// int[] c = {23, 23, 12, 4,55, 634, 23};
		// System.out.printf("%s%8s%n", "Index", "Value");

		// for (int i = 0; i < c.length; i++) {
		// 	System.out.printf("%5d%8d%n", i, c[i]);
		// }

		// Scanner sc = new Scanner(System.in);

		// System.out.println("Número:");
		// int x = sc.nextInt();

		// System.out.println();
		// System.out.println(x);
	}
}