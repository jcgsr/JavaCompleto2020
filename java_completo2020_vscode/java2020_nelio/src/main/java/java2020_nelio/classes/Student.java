package java2020_nelio.classes;

public class Student {
   // 01.11.2020 Susi no hospital e Negão tbm...

   String name;
   double n1, n2, n3, total;

   public void finalGrade() {
      total = n1 + n2 + n3;
      if (total >= 60) {
         System.out.println("FINAL GRADE = " + total);
         System.out.println("PASS");
      } else { 
         System.out.println("FINAL GRADE = " + total);
         System.out.println("FAILED");
         double miss = 60 - total;
         System.out.println("MISSING " + miss + " POINTS");

      }

   }
}
