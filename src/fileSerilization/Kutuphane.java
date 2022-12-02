package fileSerilization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Kutuphane implements Serializable{
	private List<Kitap> kitaplar;

	public Kutuphane() {
		this.kitaplar = new ArrayList<>();
	}
	public List<Kitap> getKitaplar() {
		return kitaplar;
	}

	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}
	
	
}
