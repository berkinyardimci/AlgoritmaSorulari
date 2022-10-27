package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		// girilenen sayının faktorielini hesapyalan program
		
		// while
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		int faktoriyel = 1;
		
		while(sayi > 0) {
			faktoriyel = faktoriyel *sayi;
			sayi--;
		}
		System.out.println(faktoriyel);
		/*
		 * 
		 Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		int  i = 1;
		int faktoriyel =1;
		
		while(i<= sayi) {  //i <= sayi oldugu sürece çalışır
			faktoriyel = faktoriyel * i;
			i++;
		}
		System.out.println(faktoriyel);
*/
	}

}
