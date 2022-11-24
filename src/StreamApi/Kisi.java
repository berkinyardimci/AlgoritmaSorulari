package StreamApi;

public class Kisi{
	
	private String name;
	private int age;
	private ECinsiyet cinsiyet;
	
	public Kisi(String name, int age, ECinsiyet cinsiyet) {
		super();
		this.name = name;
		this.age = age;
		this.cinsiyet = cinsiyet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ECinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(ECinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	@Override
	public String toString() {
		return "Kisi [name=" + name + ", age=" + age + ", cinsiyet=" + cinsiyet + "]";
	}
	
	public void ellYasUstuMesaji() {
		System.out.println(getName() + " 50 yaş üstüdür");
	}
}
