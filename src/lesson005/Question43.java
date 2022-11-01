package lesson005;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		
		// girilen değer arrayde var mı yok mu
		
		//Türkiye
		//Türkiye , türkiye
		
		String[] dizi = { "Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka" };
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Aramak istediğniz kelime");
		String ulke = scanner.nextLine();
		
		boolean check = true;
		
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("girdiğiniz ülke var");
				check = false;
			}
		}
		if(check) {
			System.out.println("kelime yok");
		}
	}

}
