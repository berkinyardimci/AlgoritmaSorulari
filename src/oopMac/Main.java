package oopMac;

public class Main {

	public static void main(String[] args) {
		
		
		//Array ve ArrayList farkını, ne zaman neyi kullanmayı tercih edersiniz
		//ArrayList ve LinkedList farkı nerde ne zaman kullanılır
		
		//bitane takımlar diye array açıcaz
		//takimları arrayin içine atıcaz
		
		Takim[] takimlar = new Takim[4];
		TakimManager takimManager = new TakimManager();
		
		Takim takim1 = new Takim("Barcelona");
		Takim takim2 = new Takim("RealMadrid");
		Takim takim3 = new Takim("Sevilla");
		Takim takim4 = new Takim("Atletico Madrid");
		
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim3, takim4);
		takimManager.macYap(takim4, takim1);
		takimManager.macYap(takim3, takim2);
		takimManager.macYap(takim2, takim4);
		takimManager.macYap(takim1, takim2);
		
		takimlar[0]= takim1;
		takimlar[1] = takim2;
		takimlar[2] = takim3;
		takimlar[3] = takim4;
		
		takimManager.kasaDurumu(takim1);
		takimManager.kasaDurumu(takim2);
		takimManager.kasaDurumu(takim3);
		takimManager.kasaDurumu(takim4);
		takimManager.puanDurumuGoster(takimlar);
		//takimManager.iflasDurumuGoster(takimlar);
		
		takimManager.sampiyonGoster(takimlar);
		
		//17:13
		
		/*
		 * Takım diye bir sınıf oluşturalım
		 * name ve puan, kasa fieldları olsun
		 * takımlar aralarında maç yapacak şekilde method yazalım
		 * methodda random 1 2 ve 3 sayıları arasından seçilcek
		 * 1 gelirse ilk takım maçı kazancak 3 puan alacak takım kasasına 10.000 tl
		 * 2 gelirse ikinci takım maçı kazancak 3 puan alacak takım kasasına 10.000 tl
		 * 1 ve ya 2 gelmesse eğer maç beraber biter iki tkaımda 1 er puan alır ve iki takımın kasasınada 5.000tl
		 * takım1 barcelona takım2 realmadrid
		 * barcelona realmadride karşı maçı kazanmaıştır
		 */
		
		//takimManager.macYap(takim1, takim2);
		
		//kasa göster methodu
		//çıktı -> takım ismi ... + takım kasası ...
		
		
		//puan durumu gösteren method parametre olarak takimlar array'ini göndercez
		//çıktı--> takım + puanı bize yazdırsın
		
		//iflasetmedurumun() olan takımları bize göstersin
		//takımın kasası 5000 den az ise bu takımları listeliycez
		
		//Sampiyonu Goster methodu
		//parametre olarak takimlar array
		// !!!!Şampiyon ....
	}

}
