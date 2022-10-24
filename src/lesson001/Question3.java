package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		// verilen iki sayıdan hangisinin büyük oldugunu bulan program
		
		// int sayi1 = 5
		//int sayi2 = 10
		
		int x1 = 11, x2 = 10;
		
		if(x1>x2) {
			System.out.println("x1 x2 den büyük");
			
		}else if(x1 == x2){
			System.out.println("sayılar eşittir");
			
		}else {
			System.out.println("x2 x1 den büyüktür");
		}
		
		// Girilen 2 sayıdan hangisinin büyük oldugunu bulan
		// Scanner sınıfı ile
		
		System.out.println("********************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı girin: ");
		int a = scanner.nextInt();
		
		System.out.println("İkinci sayıyı girin: ");
		int b = scanner.nextInt();
		
		if(a>b) {
			System.out.println("1. sayı büyüktür 2.sayi");
		}else if (a==b) {
			System.out.println("sayılar eşittir");
		}else {
			System.out.println("2. sayı büyüktür 1.sayı");
		}
	}

}
