package fileSerilization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Manager {
	Kutuphane kutuphane;
	public Manager() {
		kutuphane = new Kutuphane();
	}
	
	public void dosyaOku(String path)  {
		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		try {
			fr= new FileReader(path);
			br = new BufferedReader(fr);
			sc = new Scanner(br);
			while(sc.hasNextLine()) {
				String okunanSatir = sc.nextLine();
				String array[] = okunanSatir.split(",");
				Kitap kitap = new Kitap(array[0], array[1], array[2]);
				kutuphane.getKitaplar().add(kitap);
			}
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı");
		}finally {
			try {
				fr.close();
				sc.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void farklıDosyayaAktar() {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FileUtils.ikinciOkuma));
			for (Kitap kitap : kutuphane.getKitaplar()) {
				objectOutputStream.writeObject(kitap);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void okuma() {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FileUtils.ikinciOkuma));
			for (Kitap kitap : kutuphane.getKitaplar()) {
				kitap = (Kitap) objectInputStream.readObject();
				kutuphane.getKitaplar().add(kitap);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
//Kitap (isim yazar tur), Kütüphane(kitaplar)  sınıflarımızı yazalım
// Kütüphane uygulaması ayağa kalktığında dışarıdan bir dosyadan kitap listesini okuycaz
// FileUtilden dosya pathlerini oluşturalım

//okuma methodu
//bu txt dosyamızdan verileri okuyup kütüphane listesine atalım

//kutuphane listesini içindeki verilerle serilezi işlemi yapcaz
//kitap.txt ye yazdıralım

