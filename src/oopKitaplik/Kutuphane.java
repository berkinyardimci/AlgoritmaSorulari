package oopKitaplik;

public class Kutuphane {
	
	private String[] kitaplar;
	private int index;
	
	public Kutuphane(int boyut) {
		kitaplikOlustur(boyut);
	}
	
	public void kitaplikOlustur(int boyut) {
		kitaplar = new String[boyut];
	}
}
