package oopInterface;

public class Kisi extends User {

	private String name;
	private String telNo;

	public Kisi(String soyad, String name, String telNo) {
		super(soyad);
		this.name = name;
		this.telNo = telNo;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
