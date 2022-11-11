package oopPizza;

public class PizzaTercihleri {
	
	//S.O.L.I.D
	//S--> Single Responsibility
	//her class ve her method sadece bir iş yapması lazım
	
	private int sosFiyati = 40;
	private int peynirFiyati = 100;
	private int kuriyeFiyati = 20;
	
	public void sosEkle(Pizza piza) {
		System.out.println("Sos Eklendi: tl" + sosFiyati);
		piza.setFiyat(piza.getFiyat() + sosFiyati);
		piza.setSosEklendiMı(true);
	}
	
	public void peynirEkle(Pizza piza) {
		System.out.println("Peynir Eklendi: " + peynirFiyati);
		piza.setFiyat(piza.getFiyat() + peynirFiyati);
	}
	
	public void eveSiparisVer(Pizza piza) {
		piza.setFiyat(piza.getFiyat() + kuriyeFiyati);
	}
	
	public void sosCikar(Pizza piza) {
		if(piza.isSosEklendiMı()) {
			System.out.println("Sos Çikarildi: tl " +  -sosFiyati);
			piza.setFiyat(piza.getFiyat() - sosFiyati);
		}else {
			System.out.println("zaten sos eklenmemiş");
		}
			
		
	}
	
	public void peynirCikar(Pizza piza) {
		System.out.println("Peynir Çikarildi: tl " + -peynirFiyati);
		piza.setFiyat(piza.getFiyat() - sosFiyati);
	}
	
	public void eveSiparişiIptalEt(Pizza piza) {
		piza.setFiyat(piza.getFiyat() - kuriyeFiyati);
	}
	
	public void fisAl(Pizza piza) {
		System.out.println("Toplam Fişiniz--> " + piza.getFiyat());
	}
	
}
