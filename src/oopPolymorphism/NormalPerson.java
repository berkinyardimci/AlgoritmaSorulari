package oopPolymorphism;

public class NormalPerson extends Person {
	private String normalPersonNo;

	public NormalPerson(String name, String surname, int age, String normalPersonNo) {
		super(name, surname, age);
		this.normalPersonNo = normalPersonNo;

	}

	public String getNormalPersonNo() {
		return normalPersonNo;
	}

	public void setNormalPersonNo(String normalPersonNo) {
		this.normalPersonNo = normalPersonNo;
	}
	
	@Override
	public void bilgileriGoster() {
		System.out.println("Normal Person sınıfı çağırıldı "+ this.normalPersonNo);
	}

}
