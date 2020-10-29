import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
	// 29.10.2020
	// entrada, processamento, saída

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Exercício 1");
		System.out.print("Digite um valor inteiro: ");
		int n1 = sc.nextInt();
		System.out.print("Digite outro valor inteiro: ");
		int n2 = sc.nextInt();

		int soma = n1 + n2;

		System.out.printf("SOMA = %d", soma);

		System.out.print("\n\n************\n\n");

		System.out.println("Exercício 2");
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A = %.4f", area);

		System.out.print("\n\n************\n\n");

		System.out.println("Exercício 3");
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		int C = sc.nextInt();
		System.out.print("Digite o valor de D: ");
		int D = sc.nextInt();

		int DIFERENCA = (A * B - C * D);
		System.out.printf("Diferença = %d", DIFERENCA);

		System.out.print("\n\n************\n\n");

		System.out.println("Exercício 4");
		System.out.print("Número do funcionário: ");
		int funNum = sc.nextInt();

		System.out.print("Horas trabalhadas: ");
		double horasTrab = sc.nextDouble();

		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();

		double sal = horasTrab * valorHora;

		System.out.printf("NUMBER = %d%n", funNum);
		System.out.printf("SALARY = U$ %.2f", sal);
		
		
		System.out.print("\n\n************\n\n");
	
		System.out.println("Exercício 5");
		
		System.out.println("Código da peça 1: ");
		sc.nextInt(); // linha pendente
		System.out.println("Quantidade da peça 1: ");
		int p1 = sc.nextInt();
		System.out.println("Valor da peça 1: ");
		double p1Price = sc.nextDouble();

		System.out.println("Código da peça 2: ");
		sc.nextInt(); // linha pendente

		System.out.println("Quantidade da peça 2: ");
		int p2 = sc.nextInt();
		System.out.println("Valor da peça 2: ");
		double p2Price = sc.nextDouble();
		
		double valorP1 = p1 * p1Price;
		double valorP2 = p2 * p2Price;
		
		double total = valorP1 + valorP2;
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		*/
		
		System.out.print("\n\n************\n\n");
		
		System.out.println("Exercício 6");
		double A, B, C;
		
		System.out.print("Informe valor de A: ");
		A = sc.nextDouble();
		System.out.print("Informe valor de B: ");
		B = sc.nextDouble();
		System.out.print("Informe valor de C: ");
		C = sc.nextDouble();
		
		double tri = (A * C) / 2;
		double cir = Math.PI * Math.pow(C, 2);
		double tra = (A + B) * C / 2;
		double qua = Math.pow(B, 2);
		double ret = A * B;
		
		System.out.printf("\nTRIANGULO: %.3f", tri);
		System.out.printf("\nCIRCULO: %.3f", cir);
		System.out.printf("\nTRAPEZIO: %.3f", tra);
		System.out.printf("\nQUADRADO: %.3f", qua);
		System.out.printf("\nRETANGULO: %.3f", ret);

		sc.close();
	}
}
