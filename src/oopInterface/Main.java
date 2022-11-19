package oopInterface;

public class Main {
	
	//15:40
	
	public static void main(String[] args) {
		
		Apartman apartman1 = new Apartman("Ayrancı", "Ankara", "06450", 3000, "Mehmet", "054789", "Hakan");
		
		Kisi kisi = new Kisi("kaya","ali","05844");
		Kisi kisi2 = new Kisi("hüseyin","hakan","5555");
		Kisi kisi3 = new Kisi("kaya","serkan","4444");
		
		apartman1.insanEkle(kisi);
		apartman1.insanEkle(kisi2);
		apartman1.insanEkle(kisi3);
		apartman1.yasayanlariGoster();
		
		
		System.out.println(apartman1.toString());
		apartman1.kiraOdeme();
		apartman1.binaBilgileriniGoster();
		apartman1.iletisimBilgileriniGoster();
		apartman1.gorevliMaasıOde();
		
		Villa villa = new Villa("Gölbaşı", "Ankara", "05780", 5000, "Ali", "0579881", "Hüseyin");
		System.out.println(villa.toString());
		villa.kiraOdeme();
		villa.binaBilgileriniGoster();
		villa.iletisimBilgileriniGoster();
		villa.gorevliMaasıOde();
		
		Aile aile = new Aile("uzay","ahmet","buket","yaz");
		Aile aile1 = new Aile("mars","hasan","zeynep","kış");
		Aile aile2 = new Aile("ay","ali","aslı","sonbahar");

		villa.insanEkle(kisi);
		
		villa.insanEkle(aile1);
		villa.insanEkle(aile2);
		villa.yasayanlariGoster();
		
		apartman1.insanEkle(aile);
		apartman1.yasayanlariGoster();
		
		//insanEkle(villa, aile);
		villa.yasayanlariGoster();
	}
	
	public static void insanEkle(IBinaIslemleri binaIslemleri, User user) {
		binaIslemleri.insanEkle(user);
	}


	//14:38
	
	//Bina sınıfında 
	//kiraOdeme diye abstract method kuralım
	//Apartman sınıfında --> aylık kira aidate ve temelOdeme
	//Villa sınıfında--> aylık kira aidat ve temelOdeme
	
	// IBinaIslemler diye bir interface oluşturalım
	//Apartman ve Villaya implemnt edicez
	
	//void binaBilgileriniGoster()
	//void iletisimBilgileriniGoster()
	//void gorevliMaasıOde()
	
	//apartmanda kisiler oturcak
	//bu yüzden bunları tutabilceğimiz bir field oluşturalım
	
	//villadada aileler oturcagı için
	//bunları tutabilceğimiz bir field oluşturalım
	
	
	//IBinaIslemleri
	//void insanEkle(User user)
	//void yasayanlarıGoster()
	
	//apartman clası içindeki 
	//gelen useri arralistin içine atıcaz
	//apartmanda yaşayan insanların soyadını yazdıralım
	
	//villa içinde aileleri gosterelim
	
	
	//kanal
	//kanal adi, kanal noydu
	
	//haber
	//
	//muzik
	//Televizyon nesnesi oluştururken
	//otomatik olarak arka tarfa oluşmuş olacak
	//Cnn, Fox, Number1, 
	
}
