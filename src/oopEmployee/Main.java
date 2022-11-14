package oopEmployee;

public class Main {
	public static void main(String[] args) {

		EmployerManager employerManager = new EmployerManager();

		Employee employee1 = new Employee("mete", 5000, 65, 2010);
		employerManager.calculateTax(employee1);
		employerManager.calculateBonus(employee1);
		employerManager.calculateRaiseSalary(employee1);
		employerManager.showInfo(employee1);

	}
}
