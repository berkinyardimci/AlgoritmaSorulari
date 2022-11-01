package lesson005;

public class Hw {

	public static void main(String[] args) {
		// Odev1

		// bir dizide en büyük ikinci sayıyı bulan program

		int[] sayilar = { 1258, 1258, 1258, 85,85 ,-256, 16, 0, 36, 81, 14 };

		// ödev iki tane aynı enbüyük sayı girdiğimizde doğru çıktı almamız lazım

		int enBuyuk = Integer.MIN_VALUE;
		int ikinci = Integer.MIN_VALUE;

		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] > enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = sayilar[i];

			} else if (sayilar[i] != enBuyuk && sayilar[i] > ikinci ) {
				ikinci = sayilar[i];
			}
		}
		System.out.println(" ikinci sayı enBüyük " + ikinci);
		
		//Odev2

		// bir dizide 13 var ise 13 ve bir sonra ki
		// elemanı toplama eklenmeden toplam souncu bulan program
		
		int nums[] = { 1, 13, 13, 13, 2, 5, 13, 1 };
		
		// Deadline Çarşamba 13:30
		

	}

}
