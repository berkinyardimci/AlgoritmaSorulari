package lesson007;

public class Hw {

	public static void main(String[] args) {
		
		// 1- verilen sehirler arrayinde ";" dan öncesini ayırıyoruz(split())
		// ayırdğımız bu veriyi yeni bir arraye atıyoruz.
		// ve yeni arrayı ekrana bastırıyoruz,
		
		// 2- daha sonra
		// “Adananın plaka kodu 01” örnek çıktışı gibi ekrana tekrar bastırıyoruz
		// Sehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra
		
		// split()
		// indexOf()
		// substring()
		
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

	}
	/*
	System (Adana +  "adlı şehirin plaka kodu:" 01)
	Adıyaman adlı şehirin plaka kodu: 02
	Afyonkarahisar adlı şehirin plaka kodu: 03
	Ağrı adlı şehirin plaka kodu: 04
	Amasya adlı şehirin plaka kodu: 05
	Ankara adlı şehirin plaka kodu: 06
	Antalya adlı şehirin plaka kodu: 07
	Artvin adlı şehirin plaka kodu: 08
	Aydın adlı şehirin plaka kodu: 09
	Balıkesir adlı şehirin plaka kodu: 10
	Konya adlı şehirin plaka kodu: 42
	*/

}
