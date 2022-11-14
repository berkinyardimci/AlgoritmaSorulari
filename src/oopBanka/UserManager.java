package oopBanka;

public class UserManager {

	private final String emailFormat = "@xbanka.com";

	public void otomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
				.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;

		user.setEmail(otomatikOlusanEmail);

		System.out.println(otomatikOlusanEmail);
	}

	public void altarnatifEmailOlusturma(User user) {
		String kucuk = user.getName().toLowerCase();
		String kucuk2 = user.getSurname().toLowerCase();
		user.setEmail(kucuk + "." + kucuk2 + emailFormat);
		System.out.println(user.getEmail());
	}

	public void bilgileriGoster(User user) {
		System.out.println("İsim: " + user.getName() + " Surname: " + user.getSurname() + " HesapNonuz "
				+ user.getAccount().getHesapNo() + " Email: " + user.getEmail() + " Hesap Bakiyeniz: "
				+ user.getAccount().getBakiye() + " Kredi Kartı Borcunuz " + user.getAccount().getIstenenKredi()
				+ " Kredi Notu: " + user.getAccount().getKrediNotu()

		);
	}
	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		System.out.println(para + " Değerinde kredi başvurusu yaptınız");
		System.out.println("Lütfen onay bekleyin");
	}

	public void krediKartiBorcuOdeme(Account account, double taksit) {
		if (account.getIstenenKredi() == 0) {
			System.out.println("Bu işlemi Gerçekleştiremiyoruz");
		} else {
			double guncelBorc = account.getIstenenKredi() - taksit;
			account.setIstenenKredi(guncelBorc);
			account.setKrediNotu(account.getKrediNotu() + 10);
			System.out.println(
					taksit + " tl kadar borç ödediniz, Güncel Kredi KArtı Borcunuz" + account.getIstenenKredi());
		}
	}

	public void hesaptanKrediKartiBorcuOdeme(Account account, double taksit) {
		if (taksit < account.getBakiye()) {
			account.setIstenenKredi(account.getIstenenKredi() - taksit);
			account.setBakiye(account.getBakiye() - taksit);
			account.setKrediNotu(account.getKrediNotu() + 10);
			System.out.println(taksit + " tl kadar borç ödediniz, Güncel Kredi KArtı Borcunuz"
					+ account.getIstenenKredi() + "Güncel Bakiyeniz " + account.getBakiye());
		} else {
			System.out.println("Bu işlemi Gerçekleştiremiyoruz");
		}
	}

	public void nakitAvansCek(Account account) {
		double hesabinYarisi = account.getBakiye() /2;
		if (account.getKrediNotu() >= 50) {
			account.setBakiye(account.getBakiye() - hesabinYarisi);
			System.out.println("Nakit avans çektiniz Güncel bakiyeniz: " + account.getBakiye());
		} else {
			System.out.println("Kredi notunuz yetersizdir " + account.getKrediNotu());
		}
	}
}
