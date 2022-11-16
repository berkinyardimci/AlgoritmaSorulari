package oopVeteriner;

public class Kopek extends Hayvan {

	private int asiSayisi;
	private String cins;
	private String karne;

	public Kopek(String name, boolean kayitliMi, String dogumTarihi, String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.cins = cins;
		this.tur = "Köpek";
	}

	public String getKarne() {
		return karne;
	}

	public void setKarne(String karne) {
		this.karne = karne;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	private String tur;

	public int getAsiSayisi() {
		return asiSayisi;
	}

	public void setAsiSayisi(int asiSayisi) {
		this.asiSayisi = asiSayisi;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());

	}

	@Override
	public void karneOlustur() {
		setKarne("Cinsi " + getCins() + "Türü " + getTur());
		//this.karne = tur + " " + cins;
		System.out.println("Karnesi-->" +getKarne());
	}

	@Override
	public String toString() {
		return super.toString() + "Kopek [asiSayisi=" + asiSayisi + ", cins=" + cins + ", karne=" + karne + ", tur=" + tur + "]";
	}

}
