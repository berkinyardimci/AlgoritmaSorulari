package lesson003;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// Girilen sayı Sayının mükemmel sayı olup olmadığını bulan program

		// 6 1+2+3 --> 6 6=6 mükemmel sayıdır.
		// 28 mükemmel sayı
/*
 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz :");
		int sayi = scan.nextInt();
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			} else {

			}
		}
		System.out.println(toplam);
		if (toplam == sayi) {
			System.out.println(sayi + " mükemmel sayıdır");
		} else {
			System.out.println(sayi + " mükemmel sayı değildir.");
		}
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz= ");
		int sayi = scanner.nextInt();

		int toplam = 0;
		int i = 1;
		int k = 1;
		while (k < sayi) {
			if (sayi % k == 0) {
				toplam = toplam + k;
				k++;
			} else {
				k++;
			}
		}
		if (sayi == toplam) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");
*/
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int sum = 0;
        int divider = num/2;
        while (divider > 0) {
            sum = sum + ((double)num%divider == 0 ? divider: 0);
            divider--;
            
        }
        
        String out = sum == num ? "great":"not so great";
        System.out.println(out);
		}
	}


