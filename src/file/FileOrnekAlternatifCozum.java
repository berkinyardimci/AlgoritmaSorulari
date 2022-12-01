package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;



public class FileOrnekAlternatifCozum {
	public static void main(String[] args) {
		dosayadakiSatirSayisi();
	}

	public static void dosayadakiSatirSayisi() {

		int satirSayisi = 0;
		int toplamKelimeSayisi = 0;
		int toplamKarakterSayisi = 0;
		
		HashMap<String, Integer> tekrarEdenKelimeler = new HashMap<>();

		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("mars.txt")))) {
			while (scanner.hasNextLine()) {
				String satir = scanner.nextLine();
				satirSayisi++;

				String array[] = satir.toLowerCase().split(" ");
			
				toplamKelimeSayisi = toplamKelimeSayisi + array.length;
				
				for (String kelime : array) {
					if(tekrarEdenKelimeler.containsKey(kelime)) {
						tekrarEdenKelimeler.put(kelime, tekrarEdenKelimeler.get(kelime)+ 1);
					}else {
						tekrarEdenKelimeler.put(kelime, 1);
					}
				}
				// O = 2
				/*
				for (int i = 0; i < array.length; i++) {
					toplamKarakterSayisi += array[i].length();
				}
				*/
			}
			System.out.println("Satir Sayisi :" + satirSayisi);
			System.out.println("Toplam Kelime Sayisi:" + toplamKelimeSayisi);
			System.out.println("Toplam Karakter Sayısını: " + toplamKarakterSayisi);
			
			int tekrarSayisi =0;
			String encokTekrarEdenKelime = null;
			
			for(Entry<String, Integer> temp : tekrarEdenKelimeler.entrySet()) {
				if(temp.getValue()> tekrarSayisi && !temp.getKey().equals("")) {
					encokTekrarEdenKelime = temp.getKey();
					tekrarSayisi = temp.getValue();
				}
			}
			System.out.println("En çok tekrar eden kelime: " + encokTekrarEdenKelime + " tekrar Sayisi "+  tekrarSayisi);	
		} catch (Exception e) {

		}
}}
