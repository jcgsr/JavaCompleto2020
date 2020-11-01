package java2020_nelio.classes;

import java.util.Scanner;

public class StudentTest {
   // 31.10.2020 Susi no hospital e Negão tbm...

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Student s = new Student();

      System.out.println("Student's name: ");
      s.name = sc.nextLine();
      System.out.println("Nota 1: ");
      s.n1 = sc.nextDouble();

      System.out.println("Nota 2: ");
      s.n2 = sc.nextDouble();

      System.out.println("Nota 3: ");
      s.n3 = sc.nextDouble();

      s.finalGrade();
      
      sc.close();

   }

}
