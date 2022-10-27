package lesson005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// Girilen sayının 5 in kuvveti olup olmadığını bulan program

		// While
		
		// ctrl + shift + f --> kodları düzenler
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz: ");
		double sayi = scanner.nextInt();
		boolean kontrol = true;
		
		if (sayi == 0) {
			System.out.println("0 dan farklı bir sayı giri");
		} else {
			while (kontrol == true) {
				if (sayi % 5 == 0) {
					sayi = sayi / 5;
					if (sayi == 1) {
						System.out.println("5 in kuvvetidir");
						kontrol = false;
					}
				} else {
					System.out.println("5 in kuvveti değildir");
					kontrol = false;
				}

			}
		}

	}

}
