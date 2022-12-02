package maraton2;

import java.util.HashMap;

public class BusinnesYolcu extends Yolcu {

	private static int businnessFiyat = 200;
	private static int businnessVipFiyat = 150;
	private boolean isVip;
	

	private HashMap<String, Integer> biletler = new HashMap<>();

	public BusinnesYolcu(int id, String ad, String soyad, boolean isVip) {
		super(id, ad, soyad);
		this.isVip = isVip;
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu "+ getAd() + " Biletleri "+ biletler );
	}

	@Override
	public void biletAl(EFirma firmaAdi) {
		if(isVip) {
			biletler.put(firmaAdi.name(), businnessFiyat + getBASE_FIYAT() + businnessVipFiyat);
			System.out.println(getAd() + " Adlı yolcu " + firmaAdi.name() + " İçin VİP bilet almıştır " + biletler);
		}else {
			biletler.put(firmaAdi.name(), businnessFiyat + getBASE_FIYAT());
			System.out.println(getAd() + " Adlı yolcu " + firmaAdi.name() + " İçin bilet almıştır " + biletler);
		}
		int sayi = (int) (Math.random()*koltukNolari.size());
		System.out.println(sayi);
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

	public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

}
