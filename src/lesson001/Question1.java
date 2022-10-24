package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// Verilen iki sayının çarpımını veren program.
		//Scanner
		// Girilen iki sayının çarpımını  bulalım
		
		int a = 10;
		int b = 20;
		
		int c = a *b ;
		System.out.println("sayıların çarpımı --> " +  c);
		
		System.out.println("*****************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İlk sayıyı girin");
		int sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı girin");
		int sayi2 = scanner.nextInt();
		
		int carpim = sayi1 * sayi2;
		System.out.println("Çarpım: " + carpim);
	}

}
