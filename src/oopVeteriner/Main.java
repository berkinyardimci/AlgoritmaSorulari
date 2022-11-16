package oopVeteriner;

public class Main {

	public static void main(String[] args) {
		
		Kedi kedi = new Kedi("Boncuk", true, "2010","Tekir");
		Kedi kedi2 = new Kedi("Şanslı", false, "2005","VanKedisi");
		Kedi kedi3 = new Kedi("Karabaş", false, "2022","AnkaraKEdisi");
		
		Kopek kopek = new Kopek("xyz", true, "2010","Golden");
		Kopek kopek2 = new Kopek("Boncuk", true, "2010","Tekir");
		Kopek kopek3 = new Kopek("Boncuk", true, "2010","Tekir");
		
		Musteri musteri = new Musteri("ahmet","123","ankara");
		Musteri musteri2 = new Musteri("mehmet","555","izmir");
		Musteri musteri3 = new Musteri("ali","444","istanbul");
		
		Veteriner veteriner = new Veteriner("Murat", "555", "Odtu", 5);
		Veteriner veteriner2 = new Veteriner("Hakan", "533355", "Odtu", 5);
		
		musteri.bilgileriGoster();
		
		kopek.karneOlustur();
		kedi.bilgileriGoster();
		System.out.println("*****************");
		
		musteri.hayvanEkle(kopek3);
		musteri.hayvanEkle(kedi2);
		musteri2.hayvanEkle(kopek);
		
		System.out.println("Veterinere eklenen müşteriler");
		veteriner.musteriEkle(musteri);
		veteriner.musteriEkle(musteri2);
		veteriner.musteriEkle(musteri3);
		
		veteriner2.musteriEkle(musteri2);
		veteriner.musteriListele();
		
		karneOlustur(kopek);
		karneOlustur(kedi);
		
	}
	
	public static void karneOlustur(Hayvan hayvan) {
		hayvan.karneOlustur();
	}
	
	
	//mainin dışında karne oluştur diye bir method oluşturalım
	//gelen parametreye göre hangi sınıfın methodunu çağıcagını anlasın
	
	//hem kedi sınıfnda hemde köpek sınıfnda
	//bu nesneler oluşturulurken tür kediyse kedi köpeksek köpek atancak
	
	//Hayvan sınıfında 2 tane abstract method yazıcaz
	//bilgileri goster diye
	//bu methodda hayvan bilgilerini göstercek --> to string kullanalaım
	//diğer methodda karneOlustur methodu --> köpegin cinsini ve türünü alıp otomatik karne oluşturcak
	
	//Insan sınıfınada bilgileri goster methodu yazalım
	//abstract olcak
	
	//Müsterilerimizn hayvanları olabilir
	//Müsteriler sınıfın içine bir arraylist açalım 
	//daha sonra yine bu sınıf içinde musteriye hayvan ekle methodu yazalım
	//bu hayvanları array listin içinde saklicaz
	//hayvan nesnesi + musterininIsmi + "müşterisine eklendi"
	
	//Veterinerlerinde müşterileri olsun
	//müşterileri tutucak şekilde bir arraylist oluşturalım
	//daha sonra müşteriEkle methodu yazalım
	//eklenen müşterileri bu arraylistin içine atalım
	
	//Veterinrin müşterilerini listeleyelim
	//musterileriListele
	
	
}
