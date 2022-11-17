package oopKitaplik;

public class Kutuphane {

	private String[] kitaplar;
	private int index;

	public Kutuphane(int boyut) {
		kitaplikOlustur(boyut);
	}

	public void kitaplikOlustur(int boyut) {
		kitaplar = new String[boyut];
	}

	public void kitapEkle(String yazar, String kitap) {

		if (index < kitaplar.length) {
			kitaplar[index] = yazar + "," + kitap;
			index++;
			for (String string : kitaplar) {
				System.out.println(string);
			}
		} else {
			System.out.println("Kitaplık dolmuştur");
		}
	}

	public void kitapIsmiAra(String kitapIsmi) {
		boolean kontrol = false;
		for (String kitap : kitaplar) {
			if (kitap.toLowerCase().contains(kitapIsmi.toLowerCase())) {
				kontrol = true;
			}
		}
		if (kontrol) {
			System.out.println(kitapIsmi + " Kütüphanemizde vardır");
		} else {
			System.out.println(kitapIsmi + " Kütüphanemizde yoktur");
		}
	}

	public void alternatifKitapIsmiAra(String kitapIsmi) {
		boolean kontrol = false;
		for (int i = 0; i < kitaplar.length; i++) {

			if (kitaplar[i] != null) {

				String kitap = kitaplar[i].substring(kitaplar[i].indexOf(",") + 1);

				if (kitap.equalsIgnoreCase(kitapIsmi.trim())) {
					kontrol = true;
				}
			}
		}
		if (kontrol) {
			System.out.println(kitapIsmi + " Kütüphanemizde vardır");
		} else {
			System.out.println(kitapIsmi + " Kütüphanemizde yoktur");
		}
	}

	public void yazarIsmiAra(String yazarIsmi) {
		boolean kontrol = false;
		for (int i = 0; i < kitaplar.length; i++) {

			if (kitaplar[i] != null) {

				String kitap = kitaplar[i].substring(0, kitaplar[i].indexOf(","));

				if (kitap.equalsIgnoreCase(yazarIsmi.trim())) {
					kontrol = true;
				}
			}
		}
		if (kontrol) {
			System.out.println(yazarIsmi + " Kütüphanemizde vardır");
		} else {
			System.out.println(yazarIsmi + " Kütüphanemizde yoktur");
		}
	}

	public void kitaplariListele() {
		System.out.println("Kütüphanedeki Kitaplar");
		for (int i = 0; i < kitaplar.length; i++) {

			if (kitaplar[i] != null) {
				System.out.println(kitaplar[i].substring(kitaplar[i].indexOf(",") + 1));
			}
		}
	}

}
