package maraton2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Yolcu {
	private int id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private static int BASE_FIYAT = 100;
	private boolean chekin;
	
	static List<Integer> koltukNolari = new ArrayList<>();
	

	public static List<Integer> getKoltukNolari() {
		return koltukNolari;
	}

	public static void setKoltukNolari(List<Integer> koltukNolari) {
		Yolcu.koltukNolari = koltukNolari;
	}

	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		//this.koltukNo = koltukNoOlustur();
		biletleriDoldur();
	}
	
	public abstract void yolcuBilgileriniGetir();
	public abstract void biletAl(EFirma firmaAdi);
	public abstract void checkInYap();
	public abstract void ucagaBin();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}

	public static int getBASE_FIYAT() {
		return BASE_FIYAT;
	}

	public static void setBASE_FIYAT(int bASE_FIYAT) {
		BASE_FIYAT = bASE_FIYAT;
	}

	public boolean isChekin() {
		return chekin;
	}

	public void setChekin(boolean chekin) {
		this.chekin = chekin;
	}
	private static void biletleriDoldur() {
		for (int i = 10; i < 111; i++) {
			koltukNolari.add(i);
		}
	}
	
	public static int koltukNoOlustur() {
		Random random = new Random();
		int rastgeleKoltuk = random.nextInt(100);
		return rastgeleKoltuk;
	}

}
