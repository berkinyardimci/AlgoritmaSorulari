package futbolMaci;

import java.util.ArrayList;
import java.util.List;

public class Takim {

	private String isim;
	private Kaleci kaleci;
	private List<Oyuncu> oyuncuListesi;

	public Takim(String isim) {
		this.oyuncuListesi = new ArrayList<>();
		this.isim = isim;
		defansolustur();
		ortaSahaOlusturcaz();
		forvetOlustur();
		kaleciOlustur();
	}
	//3. index
	//0. index defans1
	//4. index defans 4
	public void defansolustur() {
		for (int i = 0; i < 4; i++) {
			DefansOyuncusu defansOyuncusu = new DefansOyuncusu("Defans " +(i+1), i+2);
			defansOyuncusu.setTakim(this);
			oyuncuListesi.add(defansOyuncusu);
		}
	}
	public void ortaSahaOlusturcaz() {
		for (int i = 0; i < 4; i++) {
			OrtaSahaOyuncusu ortaSahaOyuncusu = new OrtaSahaOyuncusu("OrtaSaha " + (i + 1), i + 6);
			ortaSahaOyuncusu.setTakim(this);
			oyuncuListesi.add(ortaSahaOyuncusu);
		}
	}
	public void forvetOlustur() {
		for (int i = 0; i < 2; i++) {
			ForvetOyuncusu forvetOyuncusu = new ForvetOyuncusu("Forvet " + (i + 1), i + 10);
			forvetOyuncusu.setTakim(this);
			oyuncuListesi.add(forvetOyuncusu);
		}
	}
	public Kaleci kaleciOlustur() {
		Kaleci kaleci = new Kaleci("Kaleci1",1);
		this.kaleci = kaleci;
		kaleci.setTakim(this);
		oyuncuListesi.add(kaleci);
		return kaleci;
	}
	
	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}



	public Kaleci getKaleci() {
		return kaleci;
	}

	public void setKaleci(Kaleci kaleci) {
		this.kaleci = kaleci;
	}

	public void setKalec(Kaleci kalec) {
		this.kaleci = kalec;
	}

	public List<Oyuncu> getOyuncuListesi() {
		return oyuncuListesi;
	}

	public void setOyuncuListesi(List<Oyuncu> oyuncuListesi) {
		this.oyuncuListesi = oyuncuListesi;
	}
	@Override
	public String toString() {
		return "Takim [isim=" + isim + ", kaleci=" + kaleci + ", oyuncuListesi=" + oyuncuListesi + "]";
	}
	

}
