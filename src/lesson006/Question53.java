package lesson006;

public class Question53 {

	public static void main(String[] args) {
		// bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yoksa false
		// yazdıralım

		int[] sayilar = { 2, -256, -256, 2, 2, 1258, 32 };
		
		/*
		boolean check = false;

		for (int i = 1; i < sayilar.length; i++) {
			if (sayilar[i] == 2 && sayilar[i - 1] == 2) {
				check = true;
			}
		}
		System.out.println(check);
		 */
		boolean a = false;
		for (int i = 0; i < sayilar.length - 1; i++) {
			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
				a = true;
			}

		}
		System.out.println(a);
	}

}
