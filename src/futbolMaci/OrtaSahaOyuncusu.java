package futbolMaci;

public class OrtaSahaOyuncusu extends Oyuncu {

	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;

	public OrtaSahaOyuncusu(String ad, int formaNo) {
		super(ad, formaNo);
		this.uzunTop = 60 + getRandom().nextInt(41);
		this.ilkDokunus = 60 + getRandom().nextInt(41);
		this.topSurme = 60 + getRandom().nextInt(41);
		this.ozelYetenek = 60 + getRandom().nextInt(41);

	}
	

	@Override
	public String toString() {
		return "OrtaSahaOyuncusu [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme
				+ ", uretkenlik=" + uretkenlik + ", ozelYetenek=" + ozelYetenek + ", toString()=" + super.toString()
				+ ", getAd()=" + getAd() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + ", getRandom()=" + getRandom() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	public int getOzelYetenk() {
		return ozelYetenek;
	}

	public void setOzelYetenk(int ozelYetenk) {
		this.ozelYetenek = ozelYetenk;
	}


	@Override
	public int pasSkor() {
		int bonus = getRandom().nextInt(1, 6);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenk() * 0.2 + getDayaniklilik() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);
		return skor;
	}

}
