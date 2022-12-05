package fileSerilization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Manager {
	Kutuphane kutuphane;

	public Manager() {
		kutuphane = new Kutuphane();
	}

	public void dosyaOku(String path) {
		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			sc = new Scanner(br);
			while (sc.hasNextLine()) {
				String okunanSatir = sc.nextLine();
				String array[] = okunanSatir.split(",");
				Kitap kitap = new Kitap(array[0], array[1], array[2]);
				kutuphane.getKitaplar().add(kitap);
			}
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı");
		} finally {
			try {
				fr.close();
				sc.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// serilize
	public void serilize() {
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(FileUtils.ikinciOkuma));
			for (Kitap kitap : kutuphane.getKitaplar()) {
				objectOutputStream.writeObject(kitap);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// deserilize
	public void desereilze() {
		FileInputStream dosya = null;
		try {
			dosya = new FileInputStream("kitap.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ObjectInputStream oku = null;
		try {
			oku = new ObjectInputStream(dosya);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Kitap kitap = null;
		boolean kontrol = true;
		do {
			try {
				while ((kitap = (Kitap) oku.readObject()) != null) {
					kutuphane.getKitaplar().add(kitap);
				}
			} catch (Exception e) {
				System.out.println("null eklenemez");
				kontrol = false;
			}
		} while (kontrol);
	}
	
	public String kontrolDosyasiniOku() {
		BufferedReader reader = null;
		String oku = "";
		try {
			reader = new BufferedReader(new FileReader(FileUtils.kontrolPath));
			oku = reader.readLine();
		} catch (Exception e) {
			
		}
		return oku;
	}
	
	public void veriTabaniOlustur() {
		String kontorl = kontrolDosyasiniOku();
		
		if(kontorl.contains("0")) {
			try {
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileUtils.kontrolPath));
				bufferedWriter.write("1");
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			dosyaOku(FileUtils.ilkOkuma);
			serilize();
			System.out.println("Program ilk kez ayaga kalktı veriler serileştirildi");
		}else {
			System.out.println("Serileştirilen veriler okundu ");
			desereilze();
		}
	}
}

//14:35.

//Kitap (isim yazar tur), Kütüphane(kitaplar)  sınıflarımızı yazalım
// Kütüphane uygulaması ayağa kalktığında dışarıdan bir dosyadan kitap listesini okuycaz
// FileUtilden dosya pathlerini oluşturalım
//okuma methodu
//bu txt dosyamızdan verileri okuyup kütüphane listesine atalım
//kutuphane listesini içindeki verilerle serilezi işlemi yapcaz
//kitap.txt ye yazdıralım

//veritabanı oluştur diye bir method yazcaz
//program ilk kez açlıştığında okunan dosyalar serilize edilcek olucak
//kontrol methodu yazalım

//program 2 ve daha fazla kere çalıştığında dosyalar direkt serilize edilmiş dosyadan okunmuş olucak



