package lesson001;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		// Girilen Tl değerini USD ye çeviren program
		// 1 USD = 18.25
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("TL değerini giriniz ");
		int tl = scanner.nextInt();
		
		float dolar = tl / 18.25f;
		System.out.println("dolar değeri--> " + dolar);
		
	}
}
