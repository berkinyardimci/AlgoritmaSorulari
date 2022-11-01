package lesson005;

public class Question41 {

	public static void main(String[] args) {
		// dizide eğer a ile biten bi kelime varsa o kelimeyi "?" ile değiştirelim.
		
		// output 0. indexi değişti --> ?
		// output 1. indexi değişti --> ?
		// output 4. indexi değişti --> ?
		
		String[] dizi = { "Amerika", "Almayna", "İsveç", "Türkiye", "Danimarka" };
		
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i].endsWith("a")) {
				dizi[i] = "?";
				String yeniDizi = dizi[i];
				System.out.println(i+ ". indexi değişti --> " + yeniDizi);
			}
		}
	}

}
