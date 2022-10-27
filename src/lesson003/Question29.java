package lesson003;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// 1--> 0 basıncaya kadar tek sayıların toplamını veren program

		// 2--> Girilen sayıya kadar olan tek sayıların toplamı bulan program

		// While

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Bir sayı girin ");
		 * 
		 * int sayi = scanner.nextInt(); int toplam = 0;
		 * 
		 * while(sayi != 0) { if(sayi %2 != 0) { toplam = toplam +sayi; }
		 * System.out.println("sayı girin veya 0 a basark çıkın "); sayi =
		 * scanner.nextInt(); } System.out.println("Girilen sayıların toplamı "+
		 * toplam);
		 */
		
		
		// Girilen sayıya kadar tek olan sayıların toplamını bulan program
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("Bir sayı giriniz= ");
		int x = scanner.nextInt();
		int toplam = 0;
		
		while (x != 0) {
			if (x % 2 != 0) {
				toplam = toplam + x;
			} else {
			}
			x--;
		}
		System.out.print("Tek sayılar toplamı= " + toplam);

	}

}
