package collections;

public class Hasta implements Comparable<Hasta>{
	private String isim;
	private String sikayet;
	private int oncelik;

	public Hasta(String isim, String sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		this.oncelik = sikayet.equalsIgnoreCase("Apandist") ? 1 : sikayet.equalsIgnoreCase("Yanık") ? 2 
				:sikayet.equalsIgnoreCase("Agrı") ? 3 : 4;
		//setOncelik(sikayet);
	}
	public void setOncelik(String sikayet) {

		if (sikayet.equalsIgnoreCase("Apandisit")) {
			this.oncelik = 1;
		} else if (sikayet.equalsIgnoreCase("Yanık")) {
			this.oncelik = 2;
		} else {
			this.oncelik = 3;
		}
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	@Override
	public int compareTo(Hasta o) {
		if(o.getOncelik()> this.oncelik) {
			return -1;
		}else if(o.oncelik <this.oncelik) {
			return 1;
		}
		return 0;
	}

}
