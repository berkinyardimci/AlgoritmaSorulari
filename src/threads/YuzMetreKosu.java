package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class YuzMetreKosu {
	public static void main(String[] args) {
		
		Kosucu kosucu1 = new Kosucu("Ahmet");
		Kosucu kosucu2 = new Kosucu("Mehmet");
		
		Thread thread1 = new Thread(kosucu1);
		Thread thread2 = new Thread(kosucu2);
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		if(kosucu1.sure > kosucu2.sure) {
			System.err.println(kosucu2.name + " Yarışı kazanmıştır");
		}else {
			System.err.println(kosucu1.name + " Yarışı kazanmıştır");
		}
		
		
		//yaris();
	}
	
	//run methodu içerisinde 100 metre koşu yaptırcaz 0-100 arası her sayıda mesamiz bir artacak
	
	//her 10 metrede bir çıktı verelim kosucu şu mesafede diye
	//methodun çalışma süresini hesaplayalım
	//daha mainde 2 tane koşucu oluşturalım ve başlatalım
	
	//Başlangıç - bitiş süresi 
	
	
	// yaris methodu
	//10 tane kosucu oluştur 
	//1. koşucu 2.koşucu 
	
	//16:00
	
	/*
	public static void yaris() {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			ex.submit(new Kosucu((i+1) + ".Koşucu"));
		}
		ex.shutdown();
	}
	*/
}
