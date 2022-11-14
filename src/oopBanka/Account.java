package oopBanka;

import java.util.Random;

public class Account {

	private String hesapNo;
	private double bakiye;

	private boolean krediBasvurusu;
	private double istenenKredi;
	
	private int krediNotu;

	// alt + shift + s daha sonra
	// r ye basınca getter setter generate eder
	public Account() {
		Random random = new Random();
		//int max = 9999999;
		//int min = 1000000;
		//int rastgele = random.nextInt(max + 1 - min) + min;
		int rastgele = random.nextInt(10000000);
		String rastgeleId = String.valueOf(rastgele);
		this.hesapNo = rastgeleId;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public double getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(double istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public Account(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public void paraYatir(double miktar) {
		double bakiyeTutucu = this.bakiye;
		bakiyeTutucu += miktar;
		if (bakiyeTutucu < 10000) {
			this.bakiye += miktar;
			System.out.println(miktar + " para hesaba yatırıldı güncel bakiyeniz " + this.bakiye);
		} else {
			System.out.println("10000 tl den fazla yatıramazsınız");
		}
	}

	public void paraCek(double miktar) {
		if (miktar > this.bakiye) {
			System.out.println("Bakiyeniz yetersiz");
		} else {
			this.bakiye = this.bakiye - miktar;
			System.out.println(miktar + " Tl çektiniz Güncel bakiyeniz: " + this.bakiye);
		}
	}

	public int getKrediNotu() {
		return krediNotu;
	}

	public void setKrediNotu(int krediNotu) {
		this.krediNotu = krediNotu;
	}


}
