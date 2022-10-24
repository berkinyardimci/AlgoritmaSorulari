package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		// Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar oldugunu biliyoruz
		
		// verilen ürünün ham fiyatının bulan program
		
		// değişken isimleri --> camelCase 
		// sınıf isimleri --> PascalCase
		
		int fiyat = 100;
		float vergisizFiyat =  fiyat * 0.82f;
		System.out.println(vergisizFiyat);
		float hamFiyat =  vergisizFiyat * 0.72f;
		
		System.out.println("Ham Fiyat--> " + hamFiyat);
		
		System.out.println("*****************");
		
		// Girilen ürünün kdvsiz ve karsız fiyatı
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ürün fiyatını giriniz ");
		int urunFiyat = scanner.nextInt();
		
		float a = scanner.nextFloat();
		
		float kdvSizFiyat = urunFiyat * 0.82f;
		float ilkFiyat = kdvSizFiyat * .072f;
		
		System.out.println("ilk fiyat = " + ilkFiyat);
	}

}
