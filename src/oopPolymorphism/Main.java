package oopPolymorphism;

public class Main {
	public static void main(String[] args) {
		
		Person person = new Person("ahmet", "yaz", 20);
		
		VipPerson vipPerson = new VipPerson("mehmet", "kış", 35, "2233");
		
		NormalPerson normalPerson = new NormalPerson("ali", "bahar", 45, "4455");
		
		showInfo(person);
		showInfo(vipPerson);
		showInfo(normalPerson);
	}
	
	public static void showInfo(Person person) {
		person.bilgileriGoster();
	}
	
	//bir nesnenin farklı nesnelerin referansı tutabilme özelliğidir
}
