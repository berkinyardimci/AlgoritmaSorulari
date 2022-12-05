package musicApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Album  album1 = new Album("Album1", "Tarkan");
		album1.sarkiEkle("Kuzu Kuzu", 3.2);
		album1.sarkiEkle("Şımarık", 4.2);
		album1.sarkiEkle("Yolla", 3.6);
		albums.add(album1);
		
		Album  album2 = new Album("Album2", "Gülşen");
		album2.sarkiEkle("Bangı bangır", 3.2);
		album2.sarkiEkle("Dillere düşeceğiz", 4.2);
		album2.sarkiEkle("İltimas", 3.6);
		albums.add(album2);
		
		HashSet<Sarki> playList1 = new HashSet<>();
		albums.get(0).playListeSarkıEkle("Kuzu Kuzu", playList1);
		albums.get(0).playListeSarkıEkle("Yolla", playList1);
		albums.get(1).playListeSarkıEkle("Bangı bangır", playList1);
		albums.get(1).playListeSarkıEkle("İltimas", playList1);
		
		sarkilariGoster(playList1);
	
	}
	
	public static void play(HashSet<Sarki> playList1) {
		//switch case yapısı olcak
	}
	//iterrator kullanalaım
	private static void printMenu() {
		System.out.println("0 - cikis\n" + "1 - bir sonraki sarki\n" + "2 - bir önceki sarki\n"
				+ "3 - şuan dinlediğiniz müzik\n" + "4 - bütün şarkılar \n" + "5 - menuyu Goster\n"
				+ "6 - şuan ki müzigi sil");
	}
	
	
	public static void sarkilariGoster(HashSet<Sarki> playList1) {
		//playList1.forEach(System.out::println);
		Iterator<Sarki> iterator = playList1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

//Sarki classimiz title ve dakikası
//Album sınıfımız isim, sanatci ve sarkilar

//Album sınıfının içine sarkıEkle methodu yazalım
//parametre olarak title ve dakika alcak
//burda daha önce aynı şarkı eklenip eklenmediğini kontrol edelim bunu farklı bir methodda yazalım
//method ismi --> kontrol(title)
