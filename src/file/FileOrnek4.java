package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FileOrnek4 {
	public static void main(String[] args) {

		// dosyada kaç toplam kaç satır var;
		// toplam Kelime sayısı

		// en çok tekrar eden kelimeyi bulalım.

		dosayadakiSatirSayisi();
		harfleriDoldur();
		kelimeTekrarSayisi();
		String tekrarliKelime = kelimelerVeSayilari.entrySet().stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

		int tekrarliKelim = kelimelerVeSayilari.entrySet().stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
		System.out.println(tekrarliKelime + " " + tekrarliKelim);
		System.out.println(kelimelerVeSayilari);

		System.out.println("********************");
		String tekrarliKelime2 = Collections
				.max(kelimelerVeSayilari.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue())
				.getKey();
		int tekrarliKelimeSayisi2 = Collections
				.max(kelimelerVeSayilari.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue())
				.getValue();
		System.out.println(tekrarliKelime2 + tekrarliKelimeSayisi2);
		System.out.println("*****");
		String tekrarliKelime3 = Collections
				.max(kelimelerVeSayilari.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
		int tekrarliKelimeSayisi3 = Collections
				.max(kelimelerVeSayilari.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
		System.out.println(tekrarliKelime3 + tekrarliKelimeSayisi3);
		System.out.println("*******");
		String tekrarliKelime4 = kelimelerVeSayilari.entrySet().stream()
				.max((entry1, entry2) -> Integer.compare(entry1.getValue(), entry2.getValue())).get().getKey();
		int tekrarliKelimeSayisi4 = kelimelerVeSayilari.entrySet().stream()
				.max((entry1, entry2) -> Integer.compare(entry1.getValue(), entry2.getValue())).get().getValue();
		System.out.println(tekrarliKelime4 + tekrarliKelimeSayisi4);
		System.out.println("*********");
		System.out.println(kelimelerVeSayilari.size());

	}

	public static void dosayadakiSatirSayisi() {

		int satirSayisi = 0;
		int toplamKelimeSayisi = 0;
		int toplamKarakterSayisi = 0;

		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("mars.txt")))) {
			while (scanner.hasNextLine()) {
				String satir = scanner.nextLine();
				satirSayisi++;

				String array[] = satir.toLowerCase().split(" ");
				toplamKelimeSayisi = toplamKelimeSayisi + array.length;

				for (int i = 0; i < array.length; i++) {
					toplamKarakterSayisi += array[i].length();
				}

			}
			System.out.println("Satir Sayisi :" + satirSayisi);
			System.out.println("Toplam Kelime Sayisi:" + toplamKelimeSayisi);
			System.out.println("Toplam Karakter Sayısını: " + toplamKarakterSayisi);
		} catch (Exception e) {

		}

		/*
		 * Alternatif çözüm try { Path file = Paths.get("mars.txt"); long count =
		 * Files.lines(file).count(); System.out.println("Satır sayısı="+count); } catch
		 * (IOException e) { System.out.println("Hata..."); }
		 */
	}

	static Set<Character> harfler = new HashSet<>();
	static Map<String, Integer> kelimelerVeSayilari = new HashMap<>();

	public static int kelimeTekrarSayisi() {
		int kelimeSayisi = 0;
		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("mars.txt")))) {
			while (scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine().toLowerCase();
				String array[] = okunanSatir.split(" ");
				for (String kelime2 : array) {
					String geciciKelime = kelime2;
					char[] chars = kelime2.toCharArray();
					try {
						if (chars.length == 1 && chars[0] == 'o') {
							geciciKelime = "o";
						} else if (!harfler.contains((char) chars[0])) {
							geciciKelime = geciciKelime.substring(1);

						} else if (!harfler.contains((char) chars[chars.length - 1])) {
							geciciKelime = geciciKelime.substring(0, chars.length - 1);

						} else if (!harfler.contains((char) chars[chars.length - 2])) {
							geciciKelime = geciciKelime.substring(0, chars.length - 1);
						}
						if (kelimelerVeSayilari.containsKey(geciciKelime)) {
							kelimelerVeSayilari.put(geciciKelime, kelimelerVeSayilari.get(geciciKelime) + 1);
						} else {
							kelimelerVeSayilari.put(geciciKelime, 1);
						}
					} catch (IndexOutOfBoundsException e) {
						System.out.println("**" + geciciKelime);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File bulunamadı ");
		}
		return kelimeSayisi;
	}

	public static void harfleriDoldur() {
		for (int i = 65; i < 91; i++) {
			harfler.add((char) i);
		}
		for (int i = 97; i < 123; i++) {
			harfler.add((char) i);
		}
		harfler.add((char) 304);
		harfler.add((char) 305);
		harfler.add((char) 214);
		harfler.add((char) 246);
		harfler.add((char) 220);
		harfler.add((char) 252);
		harfler.add((char) 199);
		harfler.add((char) 231);
		harfler.add((char) 286);
		harfler.add((char) 287);
		harfler.add((char) 350);
		harfler.add((char) 351);
	}

}
