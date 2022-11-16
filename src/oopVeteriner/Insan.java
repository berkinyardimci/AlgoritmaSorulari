package oopVeteriner;

public abstract class Insan {

	private String name;
	private String tcKimlik;
	

	public Insan(String name, String tcKimlik) {
		super();
		this.name = name;
		this.tcKimlik = tcKimlik;
	}
	
	public abstract void bilgileriGoster();
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	@Override
	public String toString() {
		return "Insan [name=" + name + ", tcKimlik=" + tcKimlik + "]";
	}
	
	

}
