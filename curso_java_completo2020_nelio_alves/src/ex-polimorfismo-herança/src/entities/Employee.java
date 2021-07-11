package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHour;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Integer hours, Double valuePerHours) {
		
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hours;
	}

	public void setHour(Integer hour) {
		this.hours = hour;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public double payment() {
		return hours * valuePerHour;
	}
}
