package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {
	public static void main(String[] args) throws InterruptedException {

		Queue<String> queue = new LinkedList<>();
		queue.offer("Ahmet");
		queue.offer("Ali");
		queue.offer("Hasan");
		queue.offer("Hüseyin");
		queue.offer("Aslı");
		queue.offer("zeynep");
		queue.offer("mert");
		queue.offer("baran");
		queue.offer("tuna");
		queue.offer("hakan");
		queue.offer("serkan");
		
		Random random = new Random();
		
		int pideSayisi = random.nextInt(1,10);
		System.out.println("Pideler Çıkıyor....");
		System.out.println("Çıkan Pide sayısı= " + pideSayisi);
		
		for (int i = 1; i <= pideSayisi; i++) {
			System.out.println(queue.poll() + " pidesini aldı");
			Thread.sleep(2000);
		}
		
		System.out.println("pide kalmadı");
		System.out.println("pide alamayanlar -->" + queue);
	
	}

	// bir tane kuyruk oluşturalım
	// bu kuyruğa 10-12 tane isim ekleyelim
	// daha sonra random 1-10 arası sayi üretcez bu sayi bizim pide sayımız olacak
	// pide sayısını yazdıralım

	// kuyruga göre pideleri dağıtıcaz pide bittiğinde pide bitti uyarısı versin
	// pideyi alan kişi kuyruktan çıkacak
	// bir de pide alamayan kişileri yazdıralım
}
