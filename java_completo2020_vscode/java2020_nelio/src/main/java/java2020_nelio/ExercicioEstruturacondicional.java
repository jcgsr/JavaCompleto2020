package java2020_nelio;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturacondicional {
   // 30.10.2020

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      /*
       * System.out.println("*********"); System.out.println("Exercício 1");
       * 
       * System.out.println("Digite um número: "); int n = sc.nextInt();
       * 
       * if (n < 0) { System.out.printf("%d é um número negativo", n); } else {
       * System.out.printf("%d é um número positivo", n); }
       * 
       * System.out.println("\n*********"); System.out.println("\nExercício 2");
       * 
       * System.out.println("Informe um número: "); int par = sc.nextInt();
       * 
       * if (par % 2 == 0) { System.out.printf("%d é par!", par); } else {
       * System.out.printf("%d é ímpar!", par); }
       * 
       * System.out.println("\n*********"); System.out.println("\nExercício 3");
       * 
       * int A = sc.nextInt(); int B = sc.nextInt();
       * 
       * if (A % B == 0 || B % A == 0) { System.out.println("São Múltiplos"); } else {
       * System.out.println("Não são Multiplos"); }
       * 
       * System.out.println("\n*********"); System.out.println("\nExercício 4");
       * 
       * int horaInicial = sc.nextInt(); int horaFinal = sc.nextInt();
       * 
       * int duracao; if (horaInicial < horaFinal) { duracao = horaFinal -
       * horaInicial; } else { duracao = 24 - horaInicial + horaFinal; }
       * 
       * System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
       * 
       * System.out.println("\n*********"); System.out.println("\nExercício 5");
       * 
       * System.out.println("Informe o código: "); int cod = sc.nextInt();
       * System.out.println("Informe a quantidade: "); int qnt = sc.nextInt();
       * 
       * double price;
       * 
       * if (cod == 1) { price = 4.0; double total = qnt * price;
       * System.out.printf("Total: R$ %.2f", total); } else if (cod == 2) { price =
       * 4.50; double total = qnt * price; System.out.printf("Total: R$ %.2f", total);
       * } else if (cod == 3) { price = 5.00; double total = qnt * price;
       * System.out.printf("Total: R$ %.2f", total); } else if (cod == 4) { price =
       * 2.00; double total = qnt * price; System.out.printf("Total: R$ %.2f", total);
       * } else if (cod == 5) { price = 1.50; double total = qnt * price;
       * System.out.printf("Total: R$ %.2f", total); } else {
       * System.out.println("Informe um código entre 1 e 5"); }
       * 
       * 
       * System.out.println("\n*********"); System.out.println("\nExercício 6");
       * 
       * System.out.println("Informe um número: "); double n = sc.nextDouble();
       * 
       * if (n > 0 && n <= 25) { System.out.printf("%f está no intervalo [0,25]", n) ;
       * } else if (n > 25 && n <= 50) {
       * System.out.printf("%f está no intervalo [25,50]", n); } else if (n > 50 && n
       * <= 75) { System.out.printf("%f está no intervalo [50,75]", n); } else if (n >
       * 75 && n <= 100) { System.out.printf("%f está no intervalo [50,75]", n); }
       * else { System.out.print("Fora do inervalo."); }
       * 
       

      System.out.println("\n*********");
      System.out.println("\nExercício 7");

      System.out.println("Informe x: ");
      double x = sc.nextDouble();
      System.out.println("Informe y: ");
      double y = sc.nextDouble();

      if (x > 0 && y > 0) {
         System.out.println("Quadrante Q1");
      } else if (x > 0 && y < 0) {
         System.out.println("Quadrante Q4]");
      } else if (x < 0 && y > 0) {
         System.out.println("Quadrante Q2");
      } else if (x < 0 && y < 0) {
         System.out.println("Quadrante Q3");
      } else if (x == 0 & y == 0) {
         System.out.println("Origem.");
      } else {
         System.out.print("Não entendi...");
      }

      */

      System.out.println("\n*********");
      System.out.println("\nExercício 8");

      System.out.println("Informe o salário:");
      double sal = sc.nextDouble();
      double ir;

      if (sal <= 2000.00) {
         System.out.println("Isento");
      } else if (sal > 2000.01 && sal <= 3000.00) {
         ir = (sal - 2000) * 0.08;
         System.out.printf("R$ %.2f", ir);
      } else if (sal > 3000.01 && sal <= 4500.00) {
         ir = (sal - 3000.00) * 0.18 + 1000.00 * 0.08;
         System.out.printf("R$ %.2f", ir);
      } else if (sal > 4500.01) {
         ir = (sal - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
         System.out.printf("R$ %.2f", ir);
      }


      sc.close();
   }
}
