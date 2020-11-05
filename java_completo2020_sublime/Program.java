/*
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class ListasTeste {
	// 04.11.2020

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		List<Listas> list = new ArrayList<>();

		// Read Data
		System.out.println("How many employees will be registered? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee # " + i + ": ");

			System.out.print("Id: ");
			int id = input.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken. /try again: ");
				id = input.nextInt();
			}

			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			list.add(new Listas(id, name, salary));
		}

		// Update Salary
		System.out.println();
		System.out.println("Salary Update");
		System.out.print("Enter employee's id: ");
		int id = input.nextInt();
		Listas emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter percentage:");
			double percentage = input.nextDouble();
			emp.increaseSalary(percentage);
		}

		// Employee List
		System.out.println();
		System.out.println("List of employees:");
		for (Listas obj : list) {
			System.out.println(obj);
		}

		input.close();
	}

	public static boolean hasId(List<Listas> list, int id) {
		Listas emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}