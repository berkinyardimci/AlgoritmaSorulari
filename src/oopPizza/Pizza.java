package oopPizza;

public class Pizza {
	
	private int fiyat;

	private boolean vegi;
	private boolean sosEklendiMı;

	public boolean isSosEklendiMı() {
		return sosEklendiMı;
	}

	public void setSosEklendiMı(boolean sosEklendiMı) {
		this.sosEklendiMı = sosEklendiMı;
	}

	private int vegiFiyat = 300;
	private int normalFiyat = 200;
	
	//Construcorlar özel methotlar
	//sınıf ismiyle aynı olurlar
	
	//Overloading
	 
	public Pizza(boolean vejeteryan) {
		System.out.println("constructor çalıştı");
		this.vegi = vejeteryan;
		
		if (this.vegi) {
			this.fiyat = vegiFiyat;
		} else {
			this.fiyat = normalFiyat;
		}
	}
	
	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public boolean isVegi() {
		return vegi;
	}

	public void setVegi(boolean vegi) {
		this.vegi = vegi;
	}

}
