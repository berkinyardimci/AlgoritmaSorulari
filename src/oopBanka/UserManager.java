package oopBanka;

public class UserManager {

	private final String emailFormat = "@xbanka.com";
	
	public void otomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase()
				.replaceAll(" ",("."))
				.concat("."+ user.getSurname()
				.toLowerCase()
				.replace(' ',('.')))
				+ emailFormat;
		
		user.setEmail(otomatikOlusanEmail);
		
		System.out.println(otomatikOlusanEmail);
	}
	
	
	public void altarnatifEmailOlusturma(User user) {
		String kucuk = user.getName().toLowerCase();
		String kucuk2 = user.getSurname().toLowerCase();
		user.setEmail(kucuk+"."+kucuk2 + emailFormat);
		System.out.println(user.getEmail());
	}
	
	public void userBilgileriGoster(User user) {
		System.out.println("İsim: "+ user.getName()+
				" Surname: "+ user.getSurname()+
				" HesapNonuz "+ user.getAccount().getHesapNo() +
				" Email: " + user.getEmail() +
				" Hesap Bakiyeniz: " + user.getAccount().getBakiye());
	}
	
	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		System.out.println(para + " Değerinde kredi başvurusu yaptınız");
		System.out.println("Lütfen onay bekleyin");
	}
	
}
