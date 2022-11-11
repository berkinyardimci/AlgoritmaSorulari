package oopBanka;

public class AccounManager {
	
	public void paraYatir(Account account, double miktar) {
		if (miktar <= 10000) {
			account.setBakiye(account.getBakiye() + miktar);
			System.out.println(miktar + " Tl Yatırdınız, Güncel Bakiyeniz: " + account.getBakiye());
		} else {
			System.out.println("yatırdığınız miktar " + miktar + "Tl dir. 10000 tlden fazla yatıramazsınız");
		}
	}
	public void paraCek(Account account, double miktar) {
		if (miktar > account.getBakiye()) {
			System.out.println("Bakiyeniz Yeterli değildir: Güncel bakiyeniz " + account.getBakiye());
		} else {
			account.setBakiye(account.getBakiye() - miktar);
			System.out.println(miktar + " Tl Çektiniz, Güncel Bakiyeniz: " + account.getBakiye());
		}
	}
	public void hesapBilgileriniGoster(Account account) {
		System.out.println("Hesap Nonuz: "+ account.getHesapNo() + " Güncel Hesap Bakiyeniz " + account.getBakiye());
	}
}