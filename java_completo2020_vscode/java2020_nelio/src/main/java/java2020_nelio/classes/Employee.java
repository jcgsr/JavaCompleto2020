package java2020_nelio.classes;

import java.util.Scanner;

public class Employee {
   // 31.10.2020 Susi no hospital e Negão tbm...

   String name;
   double grossSalary;
   double tax;

   public double netSalary() {
      return grossSalary - tax;
   }

   public void increaseSalary(double x) {      
     
      double increase = grossSalary * x / 100;
      double newSalary = (increase + grossSalary) - tax;
      System.out.println("Raise of " + increase); 
      System.out.println("Updated data: " + name +  ", $ " + newSalary);   

   }
}
