package futbolMaci;

public class DefansOyuncusu extends Oyuncu{
	
	private int pozisyonAlma;
	private int kafa;
	private int sicrama;
	
	public DefansOyuncusu(String ad, int formaNo) {
		super(ad, formaNo);
		this.pozisyonAlma = 60 + getRandom().nextInt(31);
		this.kafa = 60 + getRandom().nextInt(31);
		this.sicrama = 60 + getRandom().nextInt(31);
	}
	

	@Override
	public String toString() {
		return "DefansOyuncusu [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama
				+ " getAd()=" + getAd() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() +
				 "]";
	}


	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}


	@Override
	public int pasSkor() {
		int bonus = getRandom().nextInt(0,4);
		int skor = (int) (getPas()*0.2 + getYetenek()*0.2 + getDayaniklilik()*0.1 + 
				getDogalForm() * 0.1 + getPozisyonAlma()*0.1 + getSans()*0.2+ bonus);
		return skor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
