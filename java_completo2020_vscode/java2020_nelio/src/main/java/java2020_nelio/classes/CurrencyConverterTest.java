package java2020_nelio.classes;

import java.util.Scanner;

public class CurrencyConverterTest {
   // 01.11.2020 Susi dormiu no hospital e Negão internado, dormiu lá tb

   public static void main(String[] args) {
      CurrencyConverter c = new CurrencyConverter();

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Dollar price: ");
      c.dollarPrice = sc.nextDouble();
      System.out.println("How many dollars will be bought?");
      c.amount = sc.nextDouble();

      System.out.println("Amount to be pais in reais: " + c.converter());

      sc.close();
   }
}
