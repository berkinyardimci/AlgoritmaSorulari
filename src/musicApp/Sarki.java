package musicApp;

public class Sarki {
	private String title;
	private double dakika;

	public Sarki(String title, double dakika) {
		super();
		this.title = title;
		this.dakika = dakika;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDakika() {
		return dakika;
	}

	public void setDakika(double dakika) {
		this.dakika = dakika;
	}

	@Override
	public String toString() {
		return "Sarki [title=" + title + ", dakika=" + dakika + "]";
	}
	
	

}
