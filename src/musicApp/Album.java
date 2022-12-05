package musicApp;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {

	private String name;
	private String sarkici;
	private ArrayList<Sarki> sarkilar;

	public Album(String name, String sarkici, ArrayList<Sarki> sarkilar) {
		super();
		this.name = name;
		this.sarkici = sarkici;
		this.sarkilar = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSarkici() {
		return sarkici;
	}

	public void setSarkici(String sarkici) {
		this.sarkici = sarkici;
	}

	public ArrayList<Sarki> getSarkilar() {
		return sarkilar;
	}

	public void setSarkilar(ArrayList<Sarki> sarkilar) {
		this.sarkilar = sarkilar;
	}

	public boolean kontrolTitle(String title) {
		for (Iterator iterator = sarkilar.iterator(); iterator.hasNext();) {
			Sarki sarki = (Sarki) iterator.next();
			if (sarki.getTitle().equalsIgnoreCase(title)) {
				return true;
			}
		}
		return false;
	}

	public boolean sarkiEkle(String title, double dakika) {
		boolean kontrol = kontrolTitle(title);
		if (!kontrol) {
			sarkilar.add(new Sarki(title, dakika));
			return true;
		} else {
			System.out.println("Zaten playlistte şarkı mevcut");
			return false;
		}
	}
}
//playliste şarkı ekle methodu ayzalım
//playliste şarkı eklerken hangi playliste ekliceğimizi ve hangi sarkıyı ekliceğimizi isteceği 
//için parametre olarak bir title ve bir collection yapısı alsın
//albumde olmayan şarkıyı ekleyemiyoruz

