package lesson005;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		
		// taban sayısı alcaz -->2
		// üs sayısı --> 5
		// 2 üzeri 5 i hesaplayan program
		
		//while 
		// 2^5 : 32
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir taban sayı girin");
		int taban = scanner.nextInt();
		
		System.out.println("Bir us değeri girin");
		int us = scanner.nextInt();
		
		int index = 1;
		int sonuc = 1;
		
		while(index <= us) {
			sonuc *= taban;
			index++;
		}
		System.out.println(taban + " ^ " +us + " : " + sonuc);
		

	}

}
