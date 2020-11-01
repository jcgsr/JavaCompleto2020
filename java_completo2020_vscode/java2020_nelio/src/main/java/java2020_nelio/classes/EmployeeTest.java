package java2020_nelio.classes;

import java.util.Scanner;

public class EmployeeTest {
   // 31.10.2020 Susi no hospital e Negão tbm...

   public static void main(String[] args) {
      Employee e = new Employee();

      Scanner sc = new Scanner(System.in);

      System.out.println("Employee's name: ");
      e.name = sc.nextLine();
      System.out.println("Employee's gross salary: ");
      e.grossSalary = sc.nextDouble();
      System.out.println("Employee's tax: ");
      e.tax = sc.nextDouble();

      System.out.println("Employee: " + e.name + ", $ " + e.netSalary());
     
      System.out.println("Percentage to increase salary:");
      e.increaseSalary(sc.nextDouble());

      sc.close();

   }
}
