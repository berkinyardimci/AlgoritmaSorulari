package lesson001;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		
		// kenarları verilen üçgenin nasıl bir üçgen oldugunu bulan program
		
		//ikiz kenar mı, çeşit kenar mı, eşkanır mı
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("kenar uzunluklarını giriniz");
		float kenar1 = scanner.nextFloat();
		float kenar2 = scanner.nextFloat();
		float kenar3 = scanner.nextFloat();
		
		if(kenar1 == kenar2 && kenar3 == kenar1 && kenar2 == kenar3) {
			System.out.println("eşkenar üçgendir");
			
		}else if(kenar1 != kenar2 && kenar2 != kenar3 && kenar1 != kenar3) {
			System.out.println("çeşit kenar üçgendir");
		}else {
			System.out.println("ikiz kenar üçgen");
		}
	}
}
