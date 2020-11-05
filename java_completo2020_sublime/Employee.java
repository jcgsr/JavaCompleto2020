public class Employee {
	private Integer id;
	private String name;
	private double salary;

	// Constructor
	public Employee () {

	}

	public Employee (Integer id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getID() {
		return id;
	}

	public void setID(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary (double percentage) {
		salary += salary * percentage / 100.0;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}