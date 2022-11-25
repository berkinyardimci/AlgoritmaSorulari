package streamUygulama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sepet {

	EUrun product[] = EUrun.values(); //enumları arrayin içinde tuttuk
	List<Urun> urunler = new ArrayList<>(); 
	Map<String,Integer> sepetMap = new HashMap<>();
	Map<String, Double> urunMap = new HashMap<>();
	
	public Sepet() {
		urunOlustur();
		urunFiyatMapOlustur();
	}
	
	public void urunOlustur() {
		//product arrayini liste(internetten araştırın) çevircez daha sonra streame çevircez sonra içinde işlem apabilcek duruma gelcez
		//Urun nesnesi oluşturuken değerleri EURUN içinden alcaz.
		//.map(nesne üretilcek)
		/*
		List<EUrun> eUrun = Arrays.asList(product);
		this.urunler = eUrun
				.stream()
				.map(urun-> new Urun(urun.toString(), urun.getFiyat())).collect(Collectors.toList());
		eUrun.forEach(s-> System.out.println(s.toString()));
		*/
		/*
		urunler = Arrays.asList(EUrun.values()).stream()
				.map(urun-> new Urun(urun.toString(), urun.getFiyat())).collect(Collectors.toList());
		*/
		urunler = Arrays.asList(product)
				.stream()
				.map(urun-> new Urun(urun.name(),urun.fiyat)).collect(Collectors.toList());
	}
	public void urunleriListele() {
		urunler.forEach(s-> System.out.println(s.getName()));
	}
	public void fiyatListesi() {
		urunMap.entrySet().forEach(System.out::println);
	}
	
	//urunleri ve fiyatları bir map yapısına atalım
	//ve yazdıralım
	public void urunFiyatMapOlustur() {
		//bir map yapısı oluşturalım isim ve fiyat tutsun
		//Cips = 20
		//Kola = 10
		urunMap = urunler.stream().collect(Collectors.toMap(urun ->urun.getName(), fiyat-> fiyat.getPrice()));
	}
	
	
	
	//sepette kaç adet ürün var
	public void sepetAdedi() {
		//long adet = sepetMap.entrySet().stream().filter(x-> x.getValue() >0).count();
		Integer count = sepetMap.values().stream().mapToInt(d-> d).sum();
		int sum = sepetMap.values().stream().reduce(0, Integer::sum);
		System.out.println("Sepet Adedi: " + sum);
		//.count
		//filtreme
	}
	//15:59
	
	//sadece fiyatı 50 den büyük olanları listele
	public void fiyati50denBuyukOlanlariListele() {
		List<Entry<String, Double>> ellidenBuyukler = urunMap.entrySet()
				.stream()
				.filter(x->x.getValue()>50)
				.collect(Collectors.toList());
		System.out.println("50 den Büyük olanlar Map" + ellidenBuyukler);
		
		//List<Urun> liste = urunler.stream().filter(x->x.getPrice()>50).collect(Collectors.toList());
		//System.out.println("50 den Büyük Liste" + liste);
	}
	
	public void fiyati50denBuyukOlanlarinOraniListele() {
		//ortalamasını nasıl alırız stream api ile
		List<Urun> liste = urunler.stream().filter(x->x.getPrice()>50).collect(Collectors.toList());
		double result = liste.stream().collect(Collectors.averagingDouble(Urun::getPrice));
		System.out.println("50 den büyüklerin ortalama fiyatları: " + result);
	}
	
	public void sepetTutari() {
		//sepete eklenen ürünlerin fiyatlarının toplamı
	}
	
	
	public void sepetADedii() {
		List<Integer> fiyatlar ;
	}
	
	//Sepete ürün ekleyelim
	//eğer ürün yoksa sepete eklemesin
	//ürün bulunamadı yazsın
	//eğer sepette aynı üründen varsa
	//adet sayısı 1 artsın
	//sepette hiç ürün yoksada napcaz
	//sepete ürün eklicez
	
	//kullanıcdan ürün ismi isticez
	//Scanner
	
	public void sepeteUrunEkle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("EKlemek istediğiniz ürün");
		String urun = scanner.nextLine();
		if(sepetMap.containsKey(urun)) {
			sepetMap.replace(urun, sepetMap.get(urun) + 1);
			System.out.println(urun + " Sepete Ekelendi");
		}else {
			if(urunMap.containsKey(urun)) {
				sepetMap.put(urun, 1);
				System.out.println(urun + " Sepete Ekelendi");
			}else {
				System.out.println("Eklemek istediğiniz ürün bulunamadı");
			}
		}
	}
	public void sepetiGoster() {
		System.out.println("Sepet Detayii**");
		sepetMap.entrySet().forEach(System.out::println);
	}
	
}
