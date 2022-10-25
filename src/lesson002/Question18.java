package lesson002;

import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
		
		// Girilen sayının faktoriyelini bulan program.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("faktoriel için sayı girin : ");
		
		int sayi = scanner.nextInt();
		
		int faktorial = 1;
		
		for(int i = 1; i<=sayi; i++) {
			
			faktorial = faktorial*i;
			System.out.println("Sayi " + i + " Oldugunda Faktoriel :" + faktorial);
		}
		
	}
}
