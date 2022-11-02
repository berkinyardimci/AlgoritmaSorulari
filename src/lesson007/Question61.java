package lesson007;

public class Question61 {

	public static void main(String[] args) {
		// parametre olarak int alan ve int döndüren
		// girilen ifadenini kaç basamaklı olduğunu bulan method
		// type casting işlemi kullanalım
		// int Stringe çevirip öyle bulalım

		// kacBasamakli("500")
		// 3 basamaklı sayi
		//
		// girilen değeri stringe çevirip, çevirdiğimiz ifadenin uzunluğunu bulcaz.

		// sayininBuyuklugu(50)
		// sayi 1000 den küçüktür

		sayininBuyuklugu(20000);

	}

	public static int basamakSayisi(int sayi) {

		String sayiString = String.valueOf(sayi);
		int uzunluk = sayiString.length();
		return uzunluk;
	}

	public static void sayininBuyuklugu(int sayi) {

		int numberLength = basamakSayisi(sayi);
		System.out.println(numberLength);

		if (numberLength >= 4) {
			System.out.println("sayi 1000 den büyüktür");
		} else {
			System.out.println("sayi 1000 den küçüktür");
		}

		// System.out.println(numberLength>=4 ? "sayi 1000 den büyüktür" : "sayi 1000
		// den küçüktür");
	}
}
