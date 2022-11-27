package futbolMaci;

public class ForvetOyuncusu extends Oyuncu {

	private int bitiricilik;
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;

	public ForvetOyuncusu(String ad, int formaNo) {
		super(ad, formaNo);
		this.bitiricilik = 70 + getRandom().nextInt(31);
		this.ilkDokunus = 70 + getRandom().nextInt(31);
		this.kafa = 70 + getRandom().nextInt(31);
		this.ozelYetenek = 70 + getRandom().nextInt(31);

	}
	

	@Override
	public String toString() {
		return "ForvetOyuncusu [bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa
				+ ", ozelYetenek=" + ozelYetenek + ", toString()=" + super.toString() + ", getAd()=" + getAd()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + ", getRandom()=" + getRandom() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}


	@Override
	public int pasSkor() {
		int bonus = getRandom().nextInt(1, 6);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayaniklilik() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);
		return skor;

	}

}
