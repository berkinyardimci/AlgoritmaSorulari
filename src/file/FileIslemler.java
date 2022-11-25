package file;

import java.io.File;

public class FileIslemler {
	public static void main(String[] args) {
		/*
	 	System.out.println("0- Çıkış");
		System.out.println("1- Dosya Yarat");
		System.out.println("2- Ekle");
		System.out.println("3- Okuma");
		System.out.println("4- Dosya silme");
		System.out.println("lütfen işlem seçiniz");
		*/
		
		//do while
		//while ile yapalım
		//switch Case kullanalım
		
		try {
			dosyaYarat(FileSabitler.file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void dosyaYarat(File file) throws Exception {
		//parametre olarak bir file alcak
		//eğer file var ise 
		//hata fırlatsın
		//yoksa da sadece yeni bir dosya oluşturusun
		
		if(file.exists()) {
			throw new Exception("Bu dosya öncden oluşturulmuş");
		}else {
			System.out.println("dosya oluşturuluyor...");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("dosyanız oluşturulmuştur");
		}
		
	}
}
