package oopInterface;

public abstract class Bina implements IBinaIslemleri{

	private String adres;
	private String sehir;
	private String postaKodu;
	private double aylikKira;
	private String ilgiliKisiIsim;
	private String IletisimNumarasi;
	private final static int TEMEL_ODEME = 300;
	
	public Bina(String adres, String sehir, String postaKodu, double aylikKira, String ilgiliKisiIsim,
			String iletisimNumarasi) {
		super();
		this.adres = adres;
		this.sehir = sehir;
		this.postaKodu = postaKodu;
		this.aylikKira = aylikKira;
		this.ilgiliKisiIsim = ilgiliKisiIsim;
		IletisimNumarasi = iletisimNumarasi;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getPostaKodu() {
		return postaKodu;
	}

	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}

	public double getAylikKira() {
		return aylikKira;
	}

	public void setAylikKira(double aylikKira) {
		this.aylikKira = aylikKira;
	}

	public String getIlgiliKisiIsim() {
		return ilgiliKisiIsim;
	}

	public void setIlgiliKisiIsim(String ilgiliKisiIsim) {
		this.ilgiliKisiIsim = ilgiliKisiIsim;
	}

	public String getIletisimNumarasi() {
		return IletisimNumarasi;
	}

	public void setIletisimNumarasi(String iletisimNumarasi) {
		IletisimNumarasi = iletisimNumarasi;
	}
	
	public abstract void kiraOdeme();

	@Override
	public String toString() {
		return "Bina [adres= " + adres + ", sehir= " + sehir + ", aylikKira= " + aylikKira+ "]";
	}

}
