package composicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import composicao.entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {

		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}	
	
	public void addContract(HourContract contract) {
		contracts.add(contract);  
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);  
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract hourContract : contracts) {
			cal.setTime(hourContract.getDate());
			int hourContract_year = cal.get(Calendar.YEAR);
			int hourContract_month = 1 + cal.get(Calendar.MONTH); // acrescenta 1 pq mês começa com 0
			if (year == hourContract_year && month == hourContract_month) {
				sum += hourContract.totalValue();
			}			
		}
		return sum;
	}
}
