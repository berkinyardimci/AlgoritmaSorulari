package maratonSorulari;

public class Soru1 {
	public static void main(String[] args) {
		// Soru bir dizide tekrar eden ilk sayıyı bulan ve ekrana yazdıran bir program
		// yazınız.
		//
		//int sayiDizisi[] = { 9, 7, 7, 5, 9 , 3, 7, 7, 3, 18, 2, 0, 7 };
		// int sayiDizisi[] = { 0, 1, 5, 3 };
		//int sayiDizisi[] = { };
		
		int sayiDizisi[] = { 9, 7, 5, 3, 7, 1, 4, 2, 3, 9, 7, 3, 18, 2, 0, 7 };
		
		int tekrarSayisi =0;
		boolean kontrol= false;

		for (int i = 0; i < sayiDizisi.length; i++) {
			tekrarSayisi=0;
			for (int j = 0; j < sayiDizisi.length; j++) {
				if(sayiDizisi[i] == sayiDizisi[j]) {
					tekrarSayisi ++;
				}
			}
			if (tekrarSayisi > 1) {
				System.out.println(sayiDizisi[i] + " sayisi" + tekrarSayisi + " kez tekrar edilmiştir");
				kontrol = true;
				break;
			}
		}
		if(kontrol == false) {
			System.out.println("Tekrar eden sayi bulunamamıştır");
		}
	}
}
