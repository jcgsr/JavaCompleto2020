import java.util.Scanner;

public class RoomsTest {
	// 03.11.2020 Susi no hospital, Negão tb, aniversário da Piriquita
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	Rooms[] vect = new Rooms[10];		

	System.out.print("How many rooms will be rented? ");
	int x = input.nextInt();

	for (int counter = 1; counter <= x; counter++) {
		System.out.println();
		System.out.println("Rent #" + counter + ":");
		System.out.print("Name: ");
		input.nextLine();
		String name = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		System.out.print("Room: ");
		int room = input.nextInt();
		vect[room] = new Rooms(name, email);
	}

	System.out.println();
	System.out.println("Busy rooms:");
	for (int i = 0; i < 10; i++) {
		if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
		}
	}


	input.close();
	}
}