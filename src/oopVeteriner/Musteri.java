package oopVeteriner;

import java.util.ArrayList;

public class Musteri extends Insan{
	
	private String adres;
	private ArrayList<Hayvan> hayvanListesi;
	
	public Musteri(String name, String tcKimlik, String adres) {
		super(name, tcKimlik);
		this.adres = adres;
		hayvanListesi = new ArrayList<Hayvan>();
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public void hayvanEkle(Hayvan hayvan) {
		hayvanListesi.add(hayvan);
		System.out.println(hayvan.toString() + " "+ this.getName() + "Müşterisine eklendi");
	}
	
	public void hayvanlariListele() {
		System.out.println("Sahip olduğu müşteriler ");
		for (Hayvan hayvan : hayvanListesi) {
			hayvan.bilgileriGoster();
		}
	}
	
	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return super.toString() + "Musteri [adres=" + adres + "]" + hayvanListesi;
	}
}
