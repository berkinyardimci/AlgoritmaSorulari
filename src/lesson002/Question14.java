package lesson002;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		
		// girilen 3 sayıyı büyükten küçüğe sıralayan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi1 girin:");
		int sayi1 = scanner.nextInt();
		
		System.out.println("Sayi2 girin:");
		int sayi2 = scanner.nextInt();
		
		System.out.println("Sayi3 girin:");
		int sayi3 = scanner.nextInt();
		
		/*
		if(sayi1>=sayi2 && sayi2>=sayi3) {
			System.out.println(sayi1 + " > " + sayi2 + " >" + sayi3 );
		}
		else if(sayi2>=sayi1 && sayi1>=sayi3) {
			System.out.println(sayi2 + " > " + sayi1 + " >" + sayi3 );
		}
		else if(sayi1>=sayi3 && sayi3>=sayi2) {
			System.out.println(sayi1 + " > " + sayi3 + " >" + sayi2 );
		}
		else if(sayi3>=sayi1 && sayi1>=sayi2) {
			System.out.println(sayi3 + " > " + sayi1 + " >" + sayi2 );
		}
		else if(sayi3>=sayi2 && sayi2>=sayi1) {
			System.out.println(sayi3 + " > " + sayi2 + " >" + sayi1 );
		}
		else if(sayi2>=sayi3 && sayi3>=sayi1) {
			System.out.println(sayi2 + " > " + sayi3 + " >" + sayi1 );
		}
		*/
		if(sayi1 == sayi2 && sayi1 == sayi3) {
			System.out.println("Bütün sayılar eşittir");
		}else {
			if(sayi1 > sayi2 && sayi1 > sayi3) {
				if(sayi2>sayi3) {
					System.out.println("sayi1>sayi2>sayi3");
				}else {
					System.out.println("sayi1>sayi3>sayi2");
				}
			}else if(sayi2 > sayi1 && sayi2 > sayi3) {
				if(sayi1 > sayi3) {
					System.out.println("sayi2>sayi1>sayi3");
				}else {
					System.out.println("sayi2>sayi3>sayi1");
				}
			}else {
				if(sayi1 >sayi2) {
					System.out.println("sayi3>sayi1>sayi2");
				}else {
					System.out.println("sayi3>sayi2>sayi1");
				}
			}
		}
		
		
		//14:38
	}
}
