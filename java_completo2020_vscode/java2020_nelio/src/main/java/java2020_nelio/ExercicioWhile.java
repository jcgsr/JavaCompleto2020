package java2020_nelio;

import java.util.Scanner;

public class ExercicioWhile {
   // 30.10.2020

   public static void main(String[] args) {
      int senha = 2002;

      Scanner sc = new Scanner(System.in);

      System.out.println("********");
      System.out.println("Exercício 1");

      System.out.println("Informe a senha:");
      int s = sc.nextInt();

      while (s != senha) {
         System.out.println("Senha Inválida");
         System.out.println("Tente novamente:");
         s = sc.nextInt();
      }

      System.out.println("Acesso permitido");

      System.out.println("********");
      System.out.println("Exercício 2");

      System.out.println("X: ");
      int x = sc.nextInt();
      System.out.println("Y: ");
      int y = sc.nextInt();

      while (x != 0 || y != 0) {
         if (x > 0 && y > 0) {
            System.out.println("Quadrante Q1");
         } else if (x > 0 && y < 0) {
            System.out.println("Quadrante Q4]");
         } else if (x < 0 && y > 0) {
            System.out.println("Quadrante Q2");
         } else if (x < 0 && y < 0) {
            System.out.println("Quadrante Q3");
         }

         System.out.println("X: ");
         x = sc.nextInt();
         System.out.println("Y: ");
         y = sc.nextInt();
      }

      System.out.println("********");
      System.out.println("Exercício 3");

      System.out.println("Código de 1 a 3 (4 para terminar)");
      System.out.println("1 - Álcool");
      System.out.println("2 - Gasolina");
      System.out.println("3 - Diesel");

      System.out.println("Código: ");
      int cod = sc.nextInt();

      int al = 0;
      int ga = 0;
      int di = 0;
      int to = 0;

      while (cod != 4) {
         if (cod == 1) {
            al++;

         }
         if (cod == 2) {
            ga++;

         }
         if (cod == 3) {
            di++;

         }

         if (cod == 4) {
            System.out.println("MUITO OBRIGADO");
         }
         if (cod > 4) {
            System.out.println("Informe um código válido (1 a 3)");
         }

         System.out.println("Código: ");
         cod = sc.nextInt();

      }
      to = al + ga + di;
      System.out.printf("Total de %d votos", to);
      System.out.printf("\nÁLCOOL: %d", al);
      System.out.printf("\nGASOLINA: %d", ga);
      System.out.printf("\nDIESEL: %d", di);

      sc.close();
   }
}
