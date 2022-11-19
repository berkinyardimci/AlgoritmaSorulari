package oopInterface;

import java.util.ArrayList;

//Her apartman bir Binadır
//ama her Bina bi apartman değildir
//1e 1 bir ilişki var
public class Apartman extends Bina {

	private String gorevli;
	private final double AIDAT_ODEMESI = 250;
	private final double GOREVLI_ODEMESI = 1000;
	private ArrayList<User> kisiler;

	public Apartman(String adres, String sehir, String postaKodu, double aylikKira, String ilgiliKisiIsim,
			String iletisimNumarasi, String gorevli) {
		super(adres, sehir, postaKodu, aylikKira, ilgiliKisiIsim, iletisimNumarasi);
		this.gorevli = gorevli;
		kisiler = new ArrayList<>();
	}

	public String getGorevli() {
		return gorevli;
	}

	public void setGorevli(String gorevli) {
		this.gorevli = gorevli;
	}

	@Override
	public void kiraOdeme() {
		System.out.println("Kira Ödendi-->" + (getAylikKira() + AIDAT_ODEMESI + GOREVLI_ODEMESI));

	}

	@Override
	public void binaBilgileriniGoster() {
		// System.out.println("Adres Bilgisi: " + (getAdres()+ " Şehir "+ getSehir() + "
		// Apartman Görevlisi " + getGorevli()));
		System.out.println(super.toString() + " " + getGorevli());
	}

	@Override
	public void iletisimBilgileriniGoster() {
		System.out.println("İlgili Kişi--> " + getIlgiliKisiIsim() + " Numarası--> " + getIletisimNumarasi());
	}

	@Override
	public void gorevliMaasıOde() {
		System.out.println(getGorevli() + "'nin Maaşı ödendi " + (getAylikKira() + GOREVLI_ODEMESI));
	}

	@Override
	public String toString() {
		return "Apartman [gorevli=" + gorevli + "getAdres()=" + getAdres() + ", getSehir()=" + getSehir() + "]";
	}

	@Override
	public void insanEkle(User user) {
		if(user instanceof Kisi) {
			kisiler.add(user);
			System.out.println("Apartmana " + user.getSoyad() + " Eklendi");
		}else {
			System.out.println("Apartmana aile eklenemez");
		}
	}

	@Override
	public void yasayanlariGoster() {
		System.out.println("Apartmanda yaşayan aileler");
		for (int i = 0; i < kisiler.size(); i++) {
			System.out.println("Kişinin Soyadı--> " + kisiler.get(i).getSoyad());
		}

	}

}
