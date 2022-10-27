package tekrar;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Girilenen sayının 2 ve 5 e tam bölünen sayıların ortalaması
		// 50 --> 50 for 
		//10 20 , 30 40 50 top
		
		int sayi;
		int toplam = 0; 
		int  bolen = 0; 
		int ortalama;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt(); 

        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i); 
                bolen++;
                toplam += i;
            }
        }
        ortalama = toplam / bolen;
        System.out.println("Ortalama: " + ortalama);
	}

}
