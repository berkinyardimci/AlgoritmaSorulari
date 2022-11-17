package oopKitaplik;

import java.util.Scanner;

public class SecimEkrani {
	
	static Kutuphane kitaplar;
	
	public static void ekranGoster() {
		menuGoster();

		// while döngüsü kullanalım
		// switch case
		// 8 e basınca menuyu göster
		// 0 a basınca döngüden çıksın ve sistemden çıktınız diye yazdırsın

		boolean check = true;
		while (check) {
			System.out.println("Seçimiz (Menüyü Görmek için 8)");
			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				kitaplikOlustur();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				check = false;
				System.out.println("Sistemden çıktınız");
				break;

			}
		}
	}

	public static void kitaplikOlustur() {
		kitaplar.kitaplikOlustur(0);
	}

	public static void menuGoster() {
		System.out.println("***MENU***");
		System.out.println("1-Kitaplık Oluştur");
		System.out.println("2-Kitap Ekle");
		System.out.println("3-Kitap ismi Ara");
		System.out.println("4-Yazar ismi Ara");
		System.out.println("5-Kitapları Listele");
		System.out.println("6-Yazarları Listele");
		System.out.println("7-Girilen Harfe Göre yazar ara");
		System.out.println("8-Menu Goster");
		System.out.println("0-Sistemden çık");

	}
	}


