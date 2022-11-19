package oopInterface;

import java.util.ArrayList;

public class Villa extends Bina {
	private String bahcivan;
	private static final double AIDAT_ODEMESI = 1500;
	private static final double BAHCIVAN_ODEMESI = 1750;
	private ArrayList<User> aileler;

	public Villa(String adres, String sehir, String postaKodu, double aylikKira, String ilgiliKisiIsim,
			String iletisimNumarasi, String bahcivan) {
		super(adres, sehir, postaKodu, aylikKira, ilgiliKisiIsim, iletisimNumarasi);
		this.bahcivan = bahcivan;
		aileler = new ArrayList<>();
	}

	public String getBahcivan() {
		return bahcivan;
	}

	public void setBahcivan(String bahcivan) {
		this.bahcivan = bahcivan;
	}

	public static double getAidatOdemesi() {
		return AIDAT_ODEMESI;
	}

	public static double getBahcivanOdemesi() {
		return BAHCIVAN_ODEMESI;
	}

	@Override
	public void kiraOdeme() {
		System.out.println("Villa için Kira Ödendi-->" + (getAylikKira() + AIDAT_ODEMESI + BAHCIVAN_ODEMESI));

	}

	@Override
	public void binaBilgileriniGoster() {
		// System.out.println("Adres Bilgisi: " + (getAdres()+ " Şehir "+ getSehir() + "
		// Apartman Görevlisi " + getGorevli()));
		System.out.println(super.toString() + " " + getBahcivan());
	}

	@Override
	public void iletisimBilgileriniGoster() {
		System.out.println("İlgili Kişi--> " + getIlgiliKisiIsim() + " Numarası--> " + getIletisimNumarasi());
	}

	@Override
	public void gorevliMaasıOde() {
		System.out.println(getBahcivan() + "'nin Maaşı ödendi " + (getAylikKira() + BAHCIVAN_ODEMESI));
	}

	@Override
	public void insanEkle(User user) {
		if(user instanceof Aile) {
			aileler.add(user);
			System.out.println(user.getSoyad() +" Ailes villaya eklendi" );
		}else {
			System.out.println("Villada Kişiler oturamaz");
		}
		
	}

	@Override
	public void yasayanlariGoster() {
		System.out.println("Villalarda yaşayan aileler");
		for (int i = 0; i < aileler.size(); i++) {
			System.out.println("Aile Soyadı--> " + aileler.get(i).getSoyad());
		}
		/*
		for (User user : aileler) {
			System.out.println(user.getSoyad());
		}
		*/
	}

}
