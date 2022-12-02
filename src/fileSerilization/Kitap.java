package fileSerilization;

import java.io.Serializable;

public class Kitap implements Serializable{
	
	private String isim;
	private String yazar;
	private String tur;
	
	public Kitap(String isim, String yazar, String tur) {
		super();
		this.isim = isim;
		this.yazar = yazar;
		this.tur = tur;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		return "Kitap [isim=" + isim + ", yazar=" + yazar + ", tur=" + tur + "]";
	}
	
	
}
