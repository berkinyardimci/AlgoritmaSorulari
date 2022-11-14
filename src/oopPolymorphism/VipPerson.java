package oopPolymorphism;

public class VipPerson extends Person{
	
	private String vipNo;


	public VipPerson(String name, String surname, int age, String vipNo) {
		super(name, surname, age);
		this.vipNo = vipNo;
	}

	public String getVipNo() {
		return vipNo;
	}

	public void setVipNo(String vipNo) {
		this.vipNo = vipNo;
	}
	
	@Override
	public void bilgileriGoster() {
		System.out.println("Vip Person Sınıfı çağırıldı" + this.vipNo);
	}
	
}
