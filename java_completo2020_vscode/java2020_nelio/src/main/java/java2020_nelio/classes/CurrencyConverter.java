package java2020_nelio.classes;

public class CurrencyConverter {
   // 01.11.2020
   public double dollarPrice;
   public double amount, total, totalPaid;   
   public static final double iof = 0.06;

   public double converter() {
      total = dollarPrice * amount;
      return total + total * iof;
   }
}
