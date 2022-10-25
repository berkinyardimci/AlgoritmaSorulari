package lesson002;

import java.util.Scanner;

public class Question23 {
	public static void main(String[] args) {
		
		// girilen sayıya kadar çift sayıları yazdıran program
		
		// 100 --> 2,4,6,8,.....100
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		for(int k =0; k<=sayi; k++) {
			if(k % 2 ==0) {
				System.out.println(k);
			}
		}
		System.out.println("********************");
		
		for(int i =0; i<=sayi; i+=2) {
			System.out.print(i + " ");
		}
	}
}
