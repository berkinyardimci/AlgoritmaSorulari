package maraton2File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<String, Long> kisiler = new HashMap<>();
	
	public static void main(String[] args) {
		try (Scanner scanner= new Scanner(new BufferedReader(new FileReader("rehber.txt")))){
			while(scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();
				System.out.println(okunanSatir);
				String array[] = okunanSatir.split(";");
				kisiler.put(array[0], Long.parseLong(array[2].trim()));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(kisiler);
		kisiArama();
	}
	private static void kisiArama() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aradaıgınız kişinni adını girin");
		String isim = scanner.nextLine();
		System.out.println("Aradaıgınız kişinin soyad girin");
		String soyad = scanner.nextLine();
		String adSoyad = isim + " " + soyad;
		System.out.println(adSoyad);
		if(kisiler.containsKey(adSoyad)) {
			System.out.println(adSoyad + " İsimli kişini telefon numarası: " + kisiler.get(adSoyad));
		}else {
			System.out.println("Böyle Bir kişi yoktur");
		}
	}
}
