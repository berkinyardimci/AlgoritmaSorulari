package maraton2;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {

	
	private final static int EkonomiFiyat = 100;
	
	private HashMap<String, Integer> biletler = new HashMap<>();

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu "+ getAd() + " Biletleri "+ biletler );
	
	}
	@Override
	public void biletAl(EFirma firmaAdi) {
		if(biletler.containsKey(firmaAdi.name())) {
			biletler.replace(firmaAdi.name(), biletler.get(firmaAdi.name()) + getBASE_FIYAT() + EkonomiFiyat);
			System.out.println(firmaAdi + " Adlı firmadan 1 bilet daha alınmıştır " + biletler);
		}else {
			biletler.put(firmaAdi.name(), EkonomiFiyat+getBASE_FIYAT());
			System.out.println(getAd() + " Adlı yolcu "+ firmaAdi.name() 
			+ " için Ekonomi sınıfından bilet almıştır Biletler " + biletler);
		}
		
		int sayi = (int) (Math.random()*koltukNolari.size());
		setKoltukNo(koltukNolari.get(sayi));
		koltukNolari.remove(sayi);
	}

	@Override
	public void checkInYap() {
		if(isChekin()) {
			System.out.println(getAd()+ " İçin zaten çekin yapılmıştır uçağa binebilirsiniz");
		}else {
			setChekin(true);
			System.out.println("Çekin Yapılmıştır iyi uçuşlar");
		}
	}

	@Override
	public void ucagaBin() {
		if(isChekin()) {
			System.out.println(getAd() + " " + getKoltukNo() + " Numaralı koltukta uçağa b,nebilirsiniz");
		}else {
			System.out.println("Uçağa Binmek için lütfen checkin yapın");
		}
	}

}
