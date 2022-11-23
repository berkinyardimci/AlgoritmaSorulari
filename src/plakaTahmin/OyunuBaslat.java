package plakaTahmin;

import java.util.Scanner;

public class OyunuBaslat {
	
	public static void menu() {
		PlakaTahmin plaka = new PlakaTahmin();
		
		String message = "Şehir Tahmin Oyununa Hoşgeldiniz\n" + "Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.\n"
				+ "1- Oyuna başla \n" + "2- Tahminlerim \n" + "0- Çıkış \n";
		int input;
		
		do {
			System.out.println("=================================");
			System.out.println(plaka.oyunSayisi + ". oyun");
			System.out.println(message);
			Scanner scanner2 = new Scanner(System.in);
			input = scanner2.nextInt();
			scanner2.nextLine();
			switch (input) {
			case 1:
				plaka.tahmin();
				break;
			case 2:
				plaka.tahminListem();
				break;
			case 0:
				System.out.println("Oyun kapandı");
				break;

			default:
				break;
			}
		}while(input!=0);
	}
	
	/*
	1. oyun
	Şehir Tahmin Oyununa Hoşgeldiniz
	Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.
	1- Oyuna başla 
	2- Tahminlerim 
	0- Çıkış 
	*/
}
