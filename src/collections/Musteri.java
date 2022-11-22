package collections;

public class Musteri implements Comparable<Musteri> {
	private String isim;
	private int yas;

	public Musteri(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Musteri [isim=" + isim + ", yas=" + yas + "]";
	}

	@Override
	public int compareTo(Musteri musteri) {
		if (this.yas > musteri.getYas()) {
			return -1;
		} else if (this.yas < musteri.getYas()) {
			return 1;
		}
		return 0;
	}

}
