package musicApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {

		Album album1 = new Album("Album1", "Tarkan");
		album1.sarkiEkle("Kuzu Kuzu", 3.2);
		album1.sarkiEkle("Şımarık", 4.2);
		album1.sarkiEkle("Yolla", 3.6);
		albums.add(album1);

		Album album2 = new Album("Album2", "Gülşen");
		album2.sarkiEkle("Bangı bangır", 3.2);
		album2.sarkiEkle("Dillere düşeceğiz", 4.2);
		album2.sarkiEkle("İltimas", 3.6);
		albums.add(album2);

		LinkedList<Sarki> playList1 = new LinkedList<>();
		albums.get(0).playListeSarkıEkle("Kuzu Kuzu", playList1);
		albums.get(0).playListeSarkıEkle("Yolla", playList1);
		albums.get(0).playListeSarkıEkle("Şımarık", playList1);
		albums.get(1).playListeSarkıEkle("Bangı bangır", playList1);
		albums.get(1).playListeSarkıEkle("Dillere düşeceğiz", playList1);
		albums.get(1).playListeSarkıEkle("İltimas", playList1);

		sarkilariGoster(playList1);
		play(playList1);

	}

	public static void play(LinkedList<Sarki> playList1) {
		Scanner scanner = new Scanner(System.in);
		boolean cikis = false;
		boolean kontrol = true;

		ListIterator<Sarki> listIterator = playList1.listIterator();

		if (playList1.size() == 0) {
			System.out.println("Listede şarkı yoktur");
			return;
		} else {
			System.out.println("Çalan Şarkı " + listIterator.next().toString());
			printMenu();
		}

		while (!cikis) {
			int secim = scanner.nextInt();
			scanner.nextLine();
			switch (secim) {
			case 1:
				if (!kontrol) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					kontrol = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Çalan Şarkı " + listIterator.next());
				} else {
					System.out.println("Son müziktesiniz ");
					kontrol = false;
				}
				break;
			case 2:
				if (kontrol) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					kontrol = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Çalan Şarkı " + listIterator.previous());
				} else {
					System.out.println("İlk müziktesiniz ");
					kontrol = true;
				}
				break;
			case 3:
				if (kontrol) {
					if (listIterator.hasPrevious()) {
						System.out.println("şuanda çalınan müzik " + listIterator.previous());
						kontrol = false;
					} else {
						System.out.println("İlk Müzik " + listIterator.next());
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("şuanda çalınan müzik " + listIterator.next());
						kontrol = true;
					} else {
						System.out.println("Son müzik " + listIterator.previous());
					}
				}
				break;
			case 4:
				sarkilariGoster(playList1);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList1.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Şaun çalan şarkı " +listIterator.next());
					}else if(listIterator.hasPrevious()){
						System.out.println("Şaun çalan şarkı " +listIterator.previous());
					}
				}else {
					System.out.println("Listede şarkı kalmamıştır");
				}
				break;
			case 0:
				System.out.println("playlistten çıkıldı");
				cikis = true;
				break;

			default:
				break;
			}
		}
	}

	// iterrator kullanalaım
	private static void printMenu() {
		System.out.println(
				"0 - cikis\n" + "1 - bir sonraki sarki\n" + "2 - bir önceki sarki\n" + "3 - şuan dinlediğiniz müzik\n"
						+ "4 - bütün şarkılar \n" + "5 - menuyu Goster\n" + "6 - şuan ki müzigi sil");
	}

	public static void sarkilariGoster(LinkedList<Sarki> playList1) {
		// playList1.forEach(System.out::println);
		Iterator<Sarki> iterator = playList1.iterator();
		while (iterator.hasNext()) {
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
