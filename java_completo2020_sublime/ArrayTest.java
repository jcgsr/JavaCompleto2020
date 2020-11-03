import java.util.Scanner;

// 03.11.2020 - Começando a entender arrays
public class ArrayTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		

		System.out.println("Digite qnt de números:");
		int n = input.nextInt();
		int vect[] = new int[n];

		for (int i = 0;	i < n; i++) {
			System.out.println("Informe um número:");
			vect[i] = input.nextInt();
		}
		System.out.println("Números da array");
		for (int i = 0; i < n; i++) {
			System.out.println(vect[i]);

		}
		System.out.println(vect[5]);

		input.close();
	}
}