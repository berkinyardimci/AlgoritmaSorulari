package lesson003;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		
		// Girilen sayının basamklarının toplamını bulan program
		
		//Do while
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		int kalan =0;
		int toplam = 0;
		
		do {
			kalan = sayi % 10;
			sayi = sayi /10;
			toplam  += kalan;
			
		} while(sayi != 0); // sayi 0 değilse bu scope sürekli çalışır
		System.out.println(" Basamaklarının toplam --> " + toplam);
	}

}
