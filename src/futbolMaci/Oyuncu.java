package futbolMaci;

import java.util.Random;

public abstract class Oyuncu implements IOyuncu{
	private Random random = new Random();
	private String ad;
	private int formaNo;
	private int dayaniklilik;
	private int hiz;
	private int pas;
	private int sut;
	private int yetenek;
	private int kararlilik;
	private int dogalForm;
	private int sans;
	private Takim takim;
	
	public Takim getTakim() {
		return takim;
	}

	public void setTakim(Takim takim) {
		this.takim = takim;
	}

	public Oyuncu(String ad, int formaNo) {
		super();
		this.ad = ad;
		this.formaNo = formaNo;
		this.dayaniklilik = 50 + random.nextInt(51);
		this.hiz = 50 + random.nextInt(51);
		this.pas = 50 + random.nextInt(51);
		this.sut = 50 + random.nextInt(51);
		this.yetenek = 50 + random.nextInt(51);
		this.kararlilik = 50 + random.nextInt(51);
		this.dogalForm = 50 + random.nextInt(51);
		this.sans = 50 + random.nextInt(51);
	}
	
	public abstract int pasSkor();
	public abstract int golSkor(int kurtaris);
	
	@Override
	public boolean pasver() {
		int skor = pasSkor();
		if(skor>65) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean golVurusu(int kurtaris) {
		int skor = golSkor(kurtaris);
		if(skor>68) {
			return true;
		}else {
			return false;
		}
	}
	
	//bitane abstract golskor(int kurtarıs değeri)
	// kaleci için kurtarış skor methodunu yazalım
	//kaleci sınıfının içinde (dökümanda gerekli bilgiler var)
	//golSkor methodunu her bir oyunuc için override edelim.
	
	//IOyuncu interfacesine golvuruşumethodu yazalım parametre olarak int kurtarış alsın
	//Oyuncu sınıfında override edelim
	
	//Mac sınıfının içinde golVuruşu diye bir method oluşturalım
	//parametre olarak olarak Oyunuc oyuncu alsın
	
	//karşı takımın kalecisini almamız
	//golvuruş methodunu çağıralım golVurusu(kalecini kurtarıs skorunu göndercez)
	//parametre olarak oyuncu gönderdiğimiz için Oyuncu sınıfına field eklememiz laızm
	
	
	@Override
	public String toString() {
		return "Oyuncu [random=" + random + ", ad=" + ad + ", formaNo=" + formaNo + ", dayaniklilik=" + dayaniklilik
				+ ", hiz=" + hiz + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararlilik + ", dogalForm=" + dogalForm + ", sans=" + sans + "]";
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getFormaNo() {
		return formaNo;
	}

	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}

	public int getDayaniklilik() {
		return dayaniklilik;
	}

	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getYetenek() {
		return yetenek;
	}

	public void setYetenek(int yetenek) {
		this.yetenek = yetenek;
	}

	public int getKararlilik() {
		return kararlilik;
	}

	public void setKararlilik(int kararlilik) {
		this.kararlilik = kararlilik;
	}

	public int getDogalForm() {
		return dogalForm;
	}

	public void setDogalForm(int dogalForm) {
		this.dogalForm = dogalForm;
	}

	public int getSans() {
		return sans;
	}

	public void setSans(int sans) {
		this.sans = sans;
	}
	public Random getRandom() {
		return random;
	}

}
