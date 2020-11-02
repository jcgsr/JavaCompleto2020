package java2020_nelio.classes;

public class BankAccount {

   // 01.11.2020 continuado em 02.10.2020

   private int accountNumber;
   private String name;
   private double balance;

   // Constructor
   public BankAccount(int accountNumber) {
      this.accountNumber = accountNumber;
   }

   // Getters and Setters
   public int getAccountNumber() {
      return accountNumber;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   // Logic
   public double deposit(double amount) {
      return this.balance += amount;
   }

   public double withdraw(double amount) {
      double tax = 5.00 + amount;
      return this.balance -= tax;
   }

}
