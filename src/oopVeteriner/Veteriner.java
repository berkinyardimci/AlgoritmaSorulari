package oopVeteriner;

import java.util.ArrayList;

public class Veteriner extends Insan {

	private String mezunOlduguOkul;
	private int calismaYili;
	private ArrayList<Musteri> veterinerMusterileri;

	public Veteriner(String name, String tcKimlik, String mezunOlduguOkul, int calismaYili) {
		super(name, tcKimlik);
		this.mezunOlduguOkul = mezunOlduguOkul;
		this.calismaYili = calismaYili;
		this.veterinerMusterileri = new ArrayList<Musteri>();

	}

	public String getMezunOlduguOkul() {
		return mezunOlduguOkul;
	}

	public void setMezunOlduguOkul(String mezunOlduguOkul) {
		this.mezunOlduguOkul = mezunOlduguOkul;
	}

	public int getCalismaYili() {
		return calismaYili;
	}

	public void setCalismaYili(int calismaYili) {
		this.calismaYili = calismaYili;
	}
	
	public void musteriEkle(Musteri musteri) {
		veterinerMusterileri.add(musteri);
		System.out.println(musteri.getName() + " " + getName() + " Veterinere Eklendi");
	}
	
	public void musteriListele() {
		System.out.println("Sahip olduğu müşteriler ");
		System.out.println(this.getName() + "'ın Sahip olduğu müşteriler");
		for (Musteri musteri : veterinerMusterileri) {
			System.out.print(this.getName() + "'ın Müşterisi-->");
			musteri.bilgileriGoster();
		}
	}
	
	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return super.toString() + "Veteriner [mezunOlduguOkul=" + mezunOlduguOkul + ", calismaYili=" + calismaYili + "]";
	}
	

}
