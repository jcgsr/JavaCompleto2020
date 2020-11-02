package java2020_nelio.classes;

import java.util.Scanner;

public class BankAccountTest {
   // 01.11.2020 continuado em 02.10.2020

   public static void main(String[] args) {
      System.out.println("Cadastro de Conta Bancária");

      Scanner sc = new Scanner(System.in);

      BankAccount c1 = new BankAccount(1234);

      System.out.print("Enter account number: ");
      System.out.print(c1.getAccountNumber());

      System.out.println("");

      System.out.print("Enter accounter holder: ");
      c1.setName(sc.nextLine());

      System.out.print("Is there an initial deposit? (y/n) ");
      String res = sc.next();

      if (res.equalsIgnoreCase("y")) {
         System.out.print("Enter initial amount value: ");
         c1.setBalance(sc.nextDouble());
      } else {
         c1.setBalance(0);
      }

      System.out.println("Account data:");
      System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", c1.getAccountNumber(), c1.getName(), c1.getBalance());

      System.out.print("\nEnter a deposit value: ");
      c1.deposit(sc.nextDouble());

      System.out.println("Updated account data:");
      System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", c1.getAccountNumber(), c1.getName(), c1.getBalance());

      System.out.print("\nEnter a withdraw value: ");
      c1.withdraw(sc.nextDouble());

      System.out.println("Updated account data:");
      System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", c1.getAccountNumber(), c1.getName(), c1.getBalance());
      sc.close();

   }
}
