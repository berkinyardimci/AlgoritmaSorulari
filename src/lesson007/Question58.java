package lesson007;

import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("isim giriniz");
		String name = scanner.nextLine();
		
		System.out.println("isim giriniz");
		String surname = scanner.nextLine();
		
		isimOlustur("mehmet", "ali");
		isimOlustur(name , surname);
	}
	
	public static void isimOlustur(String name, String soyad) {
		System.out.println("isim -->" + name + " " + " Soyad--> " + soyad);
	}
	//Access Modifier
	//public --> bütün projede erişilebilir demek
	//private --> Sadece bulunduğu class
	//protected --> aynı package içinde


}
