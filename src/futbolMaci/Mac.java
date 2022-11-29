package futbolMaci;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {
		
	List<Takim> takimList;
	
	public Mac() {
		takimList = new ArrayList<>();
		takimList.add(new Takim("Ev Sahibi"));
		takimList.add(new Takim("Deplasman"));
		
	}
	
	
	public void oyna(Takim takim) {
		boolean kontrol = true;
		int index = passKontrol(12);
		
		for (int i = 0; i < 3; i++) {
			List<Oyuncu>  oyuncuListesi = takim.getOyuncuListesi();
			if(oyuncuListesi.get(index).pasver()) {
				int pasAlacak= passKontrol(index);
				System.out.println(takim.getIsim() + "adlı takımdan " + oyuncuListesi.get(index).getFormaNo()
						+ " nolu oyuncu " + oyuncuListesi.get(pasAlacak).getFormaNo() + " oyuncuya pas atıyor");
				
				index = pasAlacak;
				kontrol = true;
			}else {
				System.out.println(takim.getIsim() + "adlı takımdan " + oyuncuListesi.get(index).getFormaNo()
						+ " nolu oyuncunun pası başarısız !!!! ");
				kontrol = false;
				takim = takimDegistir(takim);
				i=-1;
			}
		}
		//o anki indexteki oyuncuyu göndermek istiyorum
		golVurusu(takim.getOyuncuListesi().get(index));
		takim= takimDegistir(takim);
		System.out.println(takim.toString()); // deplasmanı 
	}
	
	
	public int passKontrol(int index) {
		
		Random random = new Random();
		
		int oyuncuIndex = random.nextInt(10); //--5
		while(index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}
		return oyuncuIndex;
	}
	
	public Takim takimDegistir(Takim takim) {
		int teamIndex = takimList.indexOf(takim);
		if(teamIndex == 1) {
			teamIndex =0;
		}else {
			teamIndex =1;
		}
		return takimList.get(teamIndex);
	}
	
	public void golVurusu(Oyuncu oyuncu) {
		Kaleci karsiTakiminKalecisi = takimDegistir(oyuncu.getTakim()).getKaleci();	
		System.out.println("Kaleci topaUaznıyor ");
		if(oyuncu.golVurusu(karsiTakiminKalecisi.kurtarisSkor())) {
			System.out.println("Gol oldu");
		}else {
			System.out.println("Kaleci topu çıkardı");
		}
	}
}
