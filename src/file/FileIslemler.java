package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {
	public static void main(String[] args) {
		/*
		 * System.out.println("0- Çıkış"); System.out.println("1- Dosya Yarat");
		 * System.out.println("2- Ekle"); System.out.println("3- Okuma");
		 * System.out.println("4- Dosya silme");
		 * System.out.println("lütfen işlem seçiniz");
		 */
		FileIslemler fileIslemler = new FileIslemler();
		fileIslemler.menu();

	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.println("0- Çıkış");
			System.out.println("1- Dosya Yarat");
			System.out.println("2- Ekle");
			System.out.println("3- Okuma");
			System.out.println("4- Harf Değiştir");
			System.out.println("5- Dosya silme");
			System.out.println("lütfen işlem seçiniz");
			input = scanner.nextInt();

			switch (input) {
			case 1:
				try {
					dosyaYarat(FileSabitler.file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				metinEkle(FileSabitler.file);
			default:
				break;
			case 3:
				dosyaOku(FileSabitler.file);
			case 4:
				try {
					dosyaSil(FileSabitler.file);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (input != 0);
	}
	private void dosyaSil(File file) throws Exception {
		// dosyanın olması lazım
		if(file.exists()) {
			file.delete();
			System.out.println(file.getName() + "dosyanız silindi");
		}else {
			throw new Exception("Böyle bir dosya bulunamadı");
		}
	}

	public static void dosyaOku(File file)  {
		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		try {
			fr= new FileReader(file);
			br = new BufferedReader(fr);
			sc = new Scanner(br);
			while(sc.hasNextLine()) {
				String okunanSatir = sc.nextLine();
				System.out.println(okunanSatir);
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

	public static void dosyaYarat(File file) throws Exception {
		// parametre olarak bir file alcak
		// eğer file var ise
		// hata fırlatsın
		// yoksa da sadece yeni bir dosya oluşturusun

		if (file.exists()) {
			throw new Exception("Bu dosya öncden oluşturulmuş");
		} else {
			System.out.println("dosya oluşturuluyor...");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("dosyanız oluşturulmuştur");
		}
	}

	public static void metinEkle(File file) {
		//Scanner ile kullanıcıdan alcaz
		// kullanıcdan aldığımız veriyi dosyamıza yazcaz
		// bufferedWriter
		// finally
		// file.close()
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file,true));
			System.out.println("eklemek istediğiniz metni girin");
			String mesaj = scanner.nextLine();
			writer.write(mesaj + "\n");
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (Exception e2) {
					System.out.println("dosya kapatma hatası");
				}
			}
		}
	}
}
