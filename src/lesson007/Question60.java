package lesson007;

public class Question60 {

	public static void main(String[] args) {
		
		//parametre olarak Girilen Bir string ve int değerini toplayan methodu yazalım
		//methodu int 
		// daha sonra bu değeri consola yazdıralım
		
		toplama("5", 4);
		
		//9
		
	}
	
	public static int toplama(String sayi1, int sayi2) {
		
		int sayiInt = Integer.parseInt(sayi1);
		int toplam = sayiInt + sayi2;
		System.out.println("toplam "+ toplam);
		return toplam;
	}
}
