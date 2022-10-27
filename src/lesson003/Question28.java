package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// Kullanıcdan sürekli sayı alcaz ve 
		// 0 a bastığımızda bu aldığımız sayıların çarpımını veren program
		
		//While
		//ilk sayının 0 girilme durumu;
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int cevap;
		int carpim =1;
		System.out.println("çarpmak istediğiniz sayıyı girin:");
		
		while((cevap = scanner.nextInt()) !=0) {
			carpim *= cevap;
			System.out.println("çarpmak istediğiniz sayıyı girin:");
		}
		System.out.println("girdiğiniz sayıların carpımı "+ carpim);
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz, ve 0'a basark çıkın");
		
		int sayi = scanner.nextInt();
		int carpim =1;
		int ilkDeger = 0;
		
		while(sayi != 0) { //sayı 0 olmadığı sürece scope çalışır
			carpim = carpim * sayi;
			System.out.println(" Bir sayı giriniz, ve 0'a basark çıkın");
			sayi = scanner.nextInt();
			ilkDeger = 1;
		}
		
		if(ilkDeger == 0) {
			System.out.println("Programdan çıktınız");
		}else {
			System.out.println("Girdiğiniz sayıların çarpımı--> " + carpim);
		}
	}
	
	
	

}
