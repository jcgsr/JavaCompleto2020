package java2020_nelio.classes;

import java.util.Scanner;

public class RectangleTest {

   // 31.10.2020 Susi no hospital e Negão tbm...
   public static void main(String[] args) {
      
      Rectangle r = new Rectangle();

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter rectangle width and height: ");
      r.width = sc.nextDouble();
      r.height = sc.nextDouble();

      System.out.println("AREA = " + r.area());
      System.out.println("AREA = " + r.perimeter());
      System.out.println("AREA = " + r.diagonal());

      sc.close();
   }
}
