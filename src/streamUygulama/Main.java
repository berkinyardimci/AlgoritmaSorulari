package streamUygulama;

public class Main {

	public static void main(String[] args) {
	Sepet sepet = new Sepet();
	
	sepet.urunleriListele();
	sepet.fiyatListesi();
	sepet.sepetAdedi();
	sepet.fiyati50denBuyukOlanlariListele();
	sepet.fiyati50denBuyukOlanlarinOraniListele();
	sepet.sepeteUrunEkle();
	sepet.sepeteUrunEkle();
	sepet.sepeteUrunEkle();
	sepet.sepetAdedi();
	System.out.println("********");
	sepet.sepetiGoster();
	
	
	}
	//EUrun diye bir enum sınıfı oluşturalım
	//burda urun ve fiyatlarını tutucaz

	//Sepet diye bi class oluşturalım
	//product arreyde tutalım enum arrayi olacak, değerleri EUrun sınıfından alıcak (product)
	//yine aynı şekilde urunler diye bir listemiz olsun enum arrayinden buraya urunleri taşicaz (urunler)
	//map olarak sepeti tutcaz burda ürün ismi ve adet alacak şekilde. (sepetMap)
	//yine urunleri hem ismini hemde fiyatlarını tutmak için bir map daha oluşturalım. (urunMap)
	
	
}
