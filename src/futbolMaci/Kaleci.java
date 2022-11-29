package futbolMaci;

public class Kaleci extends Oyuncu {
	private int kurtaris;

	public Kaleci(String ad, int formaNo) {
		super(ad, formaNo);
		this.kurtaris = 65 + getRandom().nextInt(41);
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", toString()=" + super.toString() + ", getAd()=" + getAd()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + ", getRandom()=" + getRandom() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	@Override
	public int pasSkor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int golSkor(int kurtaris) {
		return getRandom().nextInt(2, 71);
	}

	public int kurtarisSkor() {
		int bonus = (int) (getRandom().nextInt(1, 6) * getDogalForm() * 0.025);
		int skor = (int) (kurtaris * 0.2 + getKararlilik() * 0.1 + bonus);
		return skor;
	}
	
	//15:52
}
