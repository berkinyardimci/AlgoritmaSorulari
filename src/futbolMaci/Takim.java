package futbolMaci;

import java.util.ArrayList;
import java.util.List;

public class Takim {

	private String isim;
	private Kaleci kalec;
	private List<Oyuncu> oyuncuListesi;

	public Takim(String isim) {
		this.oyuncuListesi = new ArrayList<>();
		this.isim = isim;
		defansolustur();
		ortaSahaOlusturcaz();
		forvetOlustur();
		Kaleci kaleci = new Kaleci("Kaleci1",1);
	}
	
	public void defansolustur() {
		for (int i = 0; i < 4; i++) {
			DefansOyuncusu defansOyuncusu = new DefansOyuncusu("Defans " +(i+1), i+2);
			oyuncuListesi.add(defansOyuncusu);
		}
	}
	public void ortaSahaOlusturcaz() {
		for (int i = 0; i < 4; i++) {
			OrtaSahaOyuncusu ortaSahaOyuncusu = new OrtaSahaOyuncusu("OrtaSaha " + (i + 1), i + 6);
			oyuncuListesi.add(ortaSahaOyuncusu);
		}
	}
	public void forvetOlustur() {
		for (int i = 0; i < 2; i++) {
			ForvetOyuncusu forvetOyuncusu = new ForvetOyuncusu("Forvet " + (i + 1), i + 10);
			oyuncuListesi.add(forvetOyuncusu);
		}
	}
	
	
	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Kaleci getKalec() {
		return kalec;
	}

	public void setKalec(Kaleci kalec) {
		this.kalec = kalec;
	}

	public List<Oyuncu> getOyuncuListesi() {
		return oyuncuListesi;
	}

	public void setOyuncuListesi(List<Oyuncu> oyuncuListesi) {
		this.oyuncuListesi = oyuncuListesi;
	}

}
