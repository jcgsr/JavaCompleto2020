public class Rooms {
	// 03.11.2020 Susi no hospital, Negão tb, aniversário da Piriquita

	private String name;
	private String email;

	// Constructor
	public Rooms(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return name + ", " + email;
	}
}