package lesson002;

import java.util.Scanner;

public class Question22 {
	public static void main(String[] args) {
		
	// Girilen sayının asal sayı olup olmadığının bulan program
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Bir sayı giriniz: ");
	int sayi = scanner.nextInt();
	
	int asalDegil = 1;
	
	for(int i = 2; i<sayi; i++) {
		
		if(sayi % i == 0) {
			asalDegil = 0;
		}
	}
	if(asalDegil == 0) {
		System.out.println(sayi + "  asal değildir");
	}else {
		System.out.println(sayi + "  asaldır ");
	}
}
}
