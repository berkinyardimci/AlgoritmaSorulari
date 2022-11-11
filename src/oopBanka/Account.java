package oopBanka;

public class Account {
	
	private String hesapNo;
	private double bakiye;
	
	private boolean krediBasvurusu;
	private double istenenKredi;
	
	
	//alt + shift + s daha sonra
	//r ye basınca getter sette generate eder
	
	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public double getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(int istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

	public Account() {
		
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
		if(bakiyeTutucu < 10000) {
			this.bakiye += miktar;
			System.out.println(miktar + " para hesaba yatırıldı güncel bakiyeniz " + this.bakiye);
		}else {
			System.out.println("10000 tl den fazla yatıramazsınız");
		}
	}
	
	public void paraCek(double miktar) {
		if(miktar > this.bakiye) {
			System.out.println("Bakiyeniz yetersiz" );
		}else {
			this.bakiye = this.bakiye -miktar;
			System.out.println(miktar + " Tl çektiniz Güncel bakiyeniz: " + this.bakiye);
		}
	}
	
}
