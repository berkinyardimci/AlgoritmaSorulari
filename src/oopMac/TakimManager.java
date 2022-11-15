package oopMac;

import java.util.Random;

public class TakimManager {
	
	public void macYap(Takim takim1, Takim takim2) {
		Random random = new Random();
		int durum = random.nextInt(3);
		
		if(durum == 1) {
			takim1.setPuan(takim1.getPuan() + 3);
			takim1.setKasa(takim1.getKasa() + 10000);
			System.out.println(takim1.getName() + " " +takim2.getName() + " E karşı maçı kazanmıştır");
		}else if(durum==2) {
			takim2.setPuan(takim2.getPuan() + 3);
			takim2.setKasa(takim2.getKasa() + 10000);
			System.out.println(takim2.getName() + " " +takim1.getName() + " E karşı maçı kazanmıştır");
		}else {
			takim1.setPuan(takim1.getPuan() + 1);
			takim1.setKasa(takim1.getKasa() + 5000);
			takim2.setPuan(takim2.getPuan() + 1);
			takim2.setKasa(takim2.getKasa() + 5000);
			System.out.println(takim1.getName() + " ve " +takim2.getName() + " Berabere kalmıştır");
		}
	}
	
	public void kasaDurumu(Takim takim) {
		System.out.println(takim.getName() + " Kasası--> " + takim.getKasa());
	}
	
	public void puanDurumuGoster(Takim[] takimlar) {
		System.out.println("****Puanı durumu**** ");
		for (Takim takim : takimlar) {
			System.out.println(takim.getName() + " Puanı-->" + takim.getPuan());
		}
	}
	public void iflasDurumuGoster(Takim[] takimlar) {
		System.out.println("****İflas Durumu**** ");
		for (Takim takim : takimlar) {
			if(takim.getKasa() <5000) {
				System.out.println(takim.getName()+" İflas etmek üzeredir" + " Kasası -->" + takim.getKasa());
			}
		}
	}
	
	//En yüksek iki puana sahip takım varsa
	//tekrar maç yapsınlar kazanan şampiyon olsun
	public void sampiyonGoster(Takim[] takimlar) {
		Takim sampiyon = takimlar[0];
		
		for (int i = 1; i < takimlar.length; i++) {
			if(takimlar[i].getPuan() >sampiyon.getPuan() ) {
				sampiyon = takimlar[i];
			}
		}
		System.out.println("Sampiyon--> "+ sampiyon.getName());
	}
}
