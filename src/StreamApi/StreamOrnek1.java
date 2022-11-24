package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOrnek1 {
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		users.add(new User("ahmet",1));
		users.add(new User("ali",2));
		users.add(new User("aslı",3));
		users.add(new User("zeynep",4));
		users.add(new User("deniz",5));
		users.add(new User("mehmet",6));
		users.add(new User("ahmet",7));
		users.add(new User("ahmet",8));
		
		//bütün userlerin tostring methodunu çağıralım
		users.stream().forEach(user-> System.out.println(user.toString()));
		
		//her bir user için bilgileri göster methodunu çağırlaım
		System.out.println("Bilgileri Göster methodu************");
		users.stream().forEach(user-> user.bilgileriGoster());
		//users.stream().forEach(User::bilgileriGoster);
		
		//id si 3 ten büyük olanları bir listeye atalım ve 
		//bu liste içindeki userların bilgilerini göster methodunu yazdırlaım
		System.out.println("Id'si 3 ten büyük olanlar*****LİST*******");
		List<User> filtrelenmisUserList = users.stream().filter(user-> user.getId() > 3).collect(Collectors.toList());
		filtrelenmisUserList.stream().forEach(user-> user.bilgileriGoster());
		
		//id si 3 ten küçükleri bir Sete atalım
		//daha sonra bu seti yazdıralım
		System.out.println("Id'si 3 ten küçük olanlar*****SET*******");
		Set<User> filtrelenmisUserSet = users.stream().filter(user-> user.getId() <3).collect(Collectors.toSet());
		filtrelenmisUserSet.stream().forEach(User::bilgileriGoster);
		
		//ismi ahmet olanları farklı bir listeye atalım daha sonra bu listeyi yazdıralım
		System.out.println("***Ismi Ahmet olanlar*****");
		List<User> filtrelenmisListeForAhmet = users
				.stream()
				.filter(user-> user.getName().trim().equalsIgnoreCase("ahmet"))
				.collect(Collectors.toList());
		filtrelenmisListeForAhmet.stream().forEach(User::bilgileriGoster);
		
		
		
		//her bir user için yeni bir user nesnesi oluşturalım
		//parametre olarak kendi id ve isimlerini alsınlar ve isimlerinin sonuna "!!" ekleyelim
		//yeni liste atalım ve listeyi yazdıralım
		//.map
		List<User> mapList = users.stream()
				.map(user -> new User(user.getName()+"!!" ,user.getId())).collect(Collectors.toList());
		mapList.stream().forEach(User::bilgileriGoster);
	} 
	
	
	//stream api java kaç ile geldi -->java8 le birlikte geldi
	//ve java 8 in özellikleri--> .....
	
	//User sınıfı  oluşturalım
	//id ve name olsun
	//to string methodu olsun
	//bilgileri göster methodu yazlım --> sadece ismini yazdırsın
	//mainde users diye bir liste oluşturalım
	//ve user nesneleri oluşturup users listesine atalım
}

class User{
	private String name;
	private int id;
	
	
	public User(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
	public void bilgileriGoster() {
		System.out.println("isim: " + this.name + "ID: " + this.id);
	}
	
	
}