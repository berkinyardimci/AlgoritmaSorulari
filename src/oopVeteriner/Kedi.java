package oopVeteriner;

public class Kedi extends Hayvan {

	private String tur;
	private String cins;
	private String karne;

	public Kedi(String name, boolean kayitliMi, String dogumTarihi, String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.cins = cins;
		this.tur = "Kedi";
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
		setKarne("Cinsi " + getCins()+ "Türü " + getTur());
		System.out.println("Karnesi-->" + getKarne());
	}

	@Override
	public String toString() {
		return super.toString() + "Kedi [tur=" + tur + ", cins=" + cins + ", karne= " + karne + "]";
	}
}
