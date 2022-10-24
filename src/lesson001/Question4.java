package lesson001;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
	
		
		//Verlien isim ve soy isim değerini Hello (isim) (soyasim) şeklinde yazdıran program
		
		String isim = "ahmet";
		String soyIsım = "demir";
		
		System.out.println("Hello " + isim + " " + soyIsım );
		
		System.out.println("*****************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İsim giriniz: ");
		String ad = scanner.nextLine();
		
		System.out.println("Soyisim giriniz: ");
		String soyad = scanner.nextLine();
		
		System.out.println("Hello " + ad + " " + soyad);
		
	}
}
