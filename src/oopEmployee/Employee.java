package oopEmployee;

public class Employee {
	private String employeeName;
	private double salary;
	private int workHours;
	private int hireYear;
	private double tax;
	private double bonus;
	private double raiseSalary;

	private final double taxRate = 0.05;
	private final int bonusRate = 30;
	private final int year = 2022;
	private final int salaryLimit = 2000;
	private final int hoursLimit = 40;

	private final double tenBelowYear = 0.05;
	private final double twentyBelowYear = 0.10;
	private final double twentyOverYear = 0.15;
	
	public Employee(String employeeName, double salary, int workHours, int hireYear) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double getTenBelowYear() {
		return tenBelowYear;
	}

	public double getTwentyBelowYear() {
		return twentyBelowYear;
	}

	public double getTwentyOverYear() {
		return twentyOverYear;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getRaiseSalary() {
		return raiseSalary;
	}

	public void setRaiseSalary(double raiseSalary) {
		this.raiseSalary = raiseSalary;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public int getBonusRate() {
		return bonusRate;
	}

	public int getYear() {
		return year;
	}

	public int getSalaryLimit() {
		return salaryLimit;
	}

	public int getHoursLimit() {
		return hoursLimit;
	}

}
