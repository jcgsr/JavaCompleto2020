package java2020_nelio;

import java.util.Scanner;

public class ExercicioFor {
   // 31.10.2020

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      /*
       * System.out.println("********"); System.out.println("Exercício 1");
       * 
       * System.out.println("Informe X: "); int x = sc.nextInt();
       * 
       * for (int i = 1; i <= x; i++) { if (i % 2 != 0) { System.out.println(i); } }
       * 
       * 
       * 
       * System.out.println("********"); System.out.println("Exercício 2");
       * 
       * System.out.println("N: "); int n = sc.nextInt();
       * 
       * int d = 0; int f = 0;
       * 
       * for (int i = 0; i < n ; i++) { System.out.println("N: "); int x =
       * sc.nextInt();
       * 
       * int dentro = (x >= 10 && x <= 20) ? d++ : f++; }
       * 
       * System.out.printf("%d in", d); System.out.printf("\n%d out", f);
       * 
       * 
       * 
       * System.out.println("********"); System.out.println("Exercício 3");
       * 
       * System.out.println("Digite qunatidade de notas: "); int n = sc.nextInt();
       * double x, y, z;
       * 
       * for (int i = 0; i < n; i++) { System.out.print("n1: "); x = sc.nextDouble();
       * System.out.print("n2: "); y = sc.nextDouble(); System.out.print("n3: "); z =
       * sc.nextDouble(); double media = (x * 2.0 + y * 3.0 + z * 5.0) / (2 + 3 + 5);
       * System.out.printf("%.1f", media); }
       * 
       

      System.out.println("********");
      System.out.println("Exercício 4");

      System.out.println("Nº de Entradas:");
      int n = sc.nextInt();

      for (int i = 0; i < n; i++) {
         int x = sc.nextInt();
         int y = sc.nextInt();

         if (y == 0) {
            System.out.println("Divisão impossível");
         } else {
            int div = x / y;
            System.out.printf("%d / %d = %d", x, y, div);
         }
      }
      

      System.out.println("********");
      System.out.println("Exercício 5");

      System.out.println("N: ");
      int n = sc.nextInt();

      int f = 1;
      for (int i = 1; i <= n; i++) {
         f *= i;
      }
      System.out.printf("Fatorial de %d = %d", n, f);

     

      System.out.println("********");
      System.out.println("Exercício 6");      

      System.out.println("N: ");
      int n = sc.nextInt();

      for (int i = 1; i <= n; i++){
         if (n % i == 0) {
            System.out.println(i);
         }
      }

       */

      System.out.println("********");
      System.out.println("Exercício 7");

      System.out.println("N:");
      int n = sc.nextInt();

      for (int i = 1; i <= n; i++){
         int pri = i;
         int seg = (int) Math.pow(i, 2);
         int ter = (int) Math.pow(i, 3);

         System.out.printf("%d %d %d%n", pri, seg, ter);
      }

      sc.close();
   }
}
