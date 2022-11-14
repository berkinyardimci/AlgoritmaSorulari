package oopEmployee;

public class EmployerManager {

	public void calculateTax(Employee employee) {
		if (employee.getSalary() < (employee.getSalaryLimit())) {

			employee.setTax(employee.getSalary() * 0);
			System.out.println("Verginiz yok");
		} else {
			double calculatedTax = employee.getSalary() * employee.getTaxRate();

			employee.setTax(calculatedTax);

			System.out.println("Hesaplanan Vergi Tutarınız " + calculatedTax);
		}
	}

	public void calculateBonus(Employee employee) {
		double bonus = 0;
		if (employee.getWorkHours() > employee.getHoursLimit()) {
			bonus = (employee.getWorkHours() - employee.getHoursLimit()) * employee.getBonusRate();
			employee.setBonus(bonus);
			System.out.println("Bonus tutarınız --> " + employee.getBonus());
		}
	}

	public void calculateRaiseSalary(Employee employee) {
		int workYear = employee.getYear() - employee.getHireYear();

		if (workYear < 10) {
			employee.setRaiseSalary(employee.getSalary() * employee.getTenBelowYear());
			System.out.println("Maaş Artışınız: " + employee.getRaiseSalary());
		} else if (workYear < 20) {
			employee.setRaiseSalary(employee.getSalary() * employee.getTwentyBelowYear());
			System.out.println("Maaş Artışınız: " + employee.getRaiseSalary());
		} else {
			employee.setRaiseSalary(employee.getSalary() * employee.getTwentyOverYear());
			System.out.println("Maaş Artışınız: " + employee.getRaiseSalary());
		}
	}
	//14:30

	public void showInfo(Employee employee) {
		System.out.println("İsim: " + employee.getEmployeeName());
		System.out.println("Maas: " + employee.getSalary());
		System.out.println("Çalışılan saatler: " + employee.getWorkHours());
		System.out.println("İşe giriş Tarihi: " + employee.getHireYear());
		System.out.println("Güncel Vergi: " + employee.getTax());
		System.out.println("Bonus : " + employee.getBonus());
		System.out.println("Maaş Artışı: " + employee.getRaiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: "
				+ (employee.getBonus() + employee.getSalary() - employee.getTax()));
		System.out.println("Toplam Maaş: "
				+ (employee.getBonus() + employee.getSalary() + employee.getRaiseSalary() - employee.getTax()));
	}
}
