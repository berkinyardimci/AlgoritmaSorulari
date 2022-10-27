package tekrar;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
		// taban sayısı 2
		// üs 5
		
		// çıktı--> 2 ^5 = 32
		// forloop
		
		int sayi1;
		int kuvvet;
		int sonuc = 1 ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen taban sayıyı giriniz: ");
		sayi1 = scanner.nextInt(); 

        System.out.print("Lütfen kuvveti (üs) giriniz: ");
        kuvvet = scanner.nextInt();

        for (int i = 1; i <= kuvvet; i++) {
        	sonuc *= sayi1;
        }
        System.out.println(sayi1 + "^" + kuvvet + ": " + sonuc);
		
		
	}
}
