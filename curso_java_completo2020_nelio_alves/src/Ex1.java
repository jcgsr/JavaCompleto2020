import java.util.Locale;

public class Ex1 {
	// 29.10.2020 Susi no hospital

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Peoducts:");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n", product2, price2);

		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);

		System.out.printf("\nMeasure with eight decimal places %.8f", measure);
		System.out.printf("\nRouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f", measure);

	}
}
