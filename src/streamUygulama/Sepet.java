package streamUygulama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sepet {
	
	EUrun product[] = EUrun.values(); //enumları arrayin içinde tuttuk

	List<Urun> urunler = new ArrayList<>(); 
	Map<String,Integer> sepetMap = new HashMap<>();
	Map<String, Double> urunMap = new HashMap<>();
	
	public void urunOlustur() {
		//product arrayini liste(internetten araştırın) çevircez daha sonra streame çevircez sonra içinde işlem apabilcek duruma gelcez
		//Urun nesnesi oluşturuken değerleri EURUN içinden alcaz.
		//.map(nesne üretilcek)
	}
	
	//urunleri ve fiyatları bir map yapısına atalım
	//ve yazdıralım
	public void urunFiyatMapOlustur() {
		//bir map yapısı oluşturalım isim ve fiyat tutsun
		//Cips = 20
		//Kola = 10
	}
}
