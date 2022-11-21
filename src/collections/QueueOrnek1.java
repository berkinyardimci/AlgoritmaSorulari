package collections;


import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek1 {
	public static void main(String[] args) {

		
		Queue<String> kuyruk = new LinkedList<>();
		kuyruk.offer("hasan");
		//kuyruk.offer("mert");
		//kuyruk.offer("mehmet");
		//kuyruk.offer("ahmet");
		
		
		//System.out.println(kuyruk.remove());
		//System.out.println(kuyruk.remove());
		
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		
		/*
		System.out.println(kuyruk);
		while(!kuyruk.isEmpty()) {
			System.out.println(kuyruk.poll());
		}
		System.out.println(kuyruk);
		
		*/
		
		// İlk giren ilk çıkar (FIFO)
		//bitane String kuyruk oluşturalım
		//kuyrugun içine isimler atalım
		//kuyruktaki elemanları yazdıralım
		
		//kuyruk boşalana kadar elemanları çıkarıp çıkarılan elemanı yazdıralım
	}
}
