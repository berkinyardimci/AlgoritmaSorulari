package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek3 {
	public static void main(String[] args) {
		
		Queue<Musteri> musterQueue = new PriorityQueue<>();
		
		musterQueue.offer(new Musteri("mustafa", 20));
		musterQueue.offer(new Musteri("ali", 30));
		musterQueue.offer(new Musteri("mehmet", 40));
		musterQueue.offer(new Musteri("aslı", 90));
		musterQueue.offer(new Musteri("zeynep", 25));
		musterQueue.offer(new Musteri("bugra", 100));
		
		while(!musterQueue.isEmpty()) {
			System.out.println("Kuyruktan çıkmıştır "+musterQueue.poll());
		}
		
		//ilk giren ilk çıkar (FIFO)
		
		// Musteri sınıfı açalım isim ve yas değerlerini tutsun
		// Mainde bitane Musteri tutan PriorityQueue kuyruk oluşturalım
		// ve kuyruga Musterileri atalım

		// daha sonra müşteriler yaş önceliğine göre işlemlerini yapıp kuyruktan çıkacak
		// şekilde bir döngü kuralım
		// yaşı büyük olanlar ilk sırada yer alacak
		// yaşa göre bir sıralama yapıcaz
		
		//compareTo
		
		//Banka
		//Bankamız yaşlılara öncelik tanıyo
		//işi bitenler kuyruktan çıkıyo
	}
}
