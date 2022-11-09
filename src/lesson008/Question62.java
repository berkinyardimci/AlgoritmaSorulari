package lesson008;

import java.util.Scanner;

public class Question62 {

	public static void main(String[] args) {

		// Doğum yılınızı girerek yaşınızı
		// ve hangi yüzyılda doğdunu hesaplayan metotu yazınız
		// 3 farklı metot yazalım

		// yasHesapla yuzyılHesapla ve bilgileriYazdır

		// bilgileri yazdır methodunu çağırdıgımızda
		
		// 24 yasşındasınız 20 .yüzyılda doğmussunuz diye çıktı alalım
		
		//bilgileriYazdır(1885);
		
		// yüzyıl -->  dogumYılı / 100 + 1
		
		
		bilgileriYazdir(1885);
		//bilgileriYazdir();
		
	}
	
	public static int yasHesapla(int yil) {
		int sene = 2022;
		int kacYasinda = sene- yil;
		return kacYasinda;
	}
	
	public static int yuzYilHesapla(int yil) {
		int yuzYil = yil / 100 +1;
		return yuzYil;
	}
	/*
	public static void bilgileriYazdir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen doğdunuz yılı girin ");
		
		int sene = scanner.nextInt();
		int yas = yasHesapla(sene);
		int yuzYil = yuzYilHesapla(yas);
		
		System.out.println(yas + " yaşındasınız" + yuzYil + " Yüzyilda doğdunuz");
	}
	*/
	
	public static void bilgileriYazdir(int dogumYılı) {

		int yas = yasHesapla(dogumYılı);
		int yuzYil = yuzYilHesapla(dogumYılı);

		System.out.println(yas + " yasşındasınız " + yuzYil + " .yüzyılda doğmussunuz");
	}

}
