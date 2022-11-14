package oopBanka;

public class AdminManager {

	public void krediBasvurusunuOnayla(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Başvurunuz onaylanmıştır ");
			double guncelBakiye = account.getBakiye() + account.getIstenenKredi();
			account.setBakiye(guncelBakiye);
			account.setKrediBasvurusu(false);

		} else {
			System.out.println(Constant.KREDI_BASVURUSU_YOK);
		}

	}

	public void krediBasvurusunuReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println(Constant.KREDI_BASVURU_REDDI);
			account.setKrediBasvurusu(false);
			account.setIstenenKredi(0);
		} else {
			System.out.println(Constant.KREDI_BASVURUSU_YOK);
		}
	}
	//
}
