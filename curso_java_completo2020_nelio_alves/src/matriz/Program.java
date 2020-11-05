package matriz;

import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 04.11.2020

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de linhas:");
		int m = sc.nextInt();
		System.out.println("Informe o número de colunas:");
		int n = sc.nextInt();
		
		Date d = new Date();
		System.out.println(d);

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
