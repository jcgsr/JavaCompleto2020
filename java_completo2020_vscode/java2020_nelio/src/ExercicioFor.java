import java.util.Scanner;

public class ExercicioFor {
   // 31.10.2020

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("********");
      System.out.println("Exercício 1");
      
      System.out.println("Informe X: ");
      int x = sc.nextInt();

      for (int i = 1; i <= x; i++) {
         if (x % 2 != 0) {
            System.out.println(i);
         }
      }

      sc.close();
   }
}
