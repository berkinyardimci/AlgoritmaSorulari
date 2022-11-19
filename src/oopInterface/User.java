package oopInterface;

public class User {
	private String soyad;

	public User(String soyad) {
		super();
		this.soyad = soyad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	@Override
	public String toString() {
		return "User [soyad=" + soyad + "]";
	}
	
	
}
