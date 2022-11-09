import java.util.Random;

public class Deneme {

	public static void main(String[] args) {
		
		//program başladığında bu array içinden rastgele bir isim çıktısı versin
		String[] sinif = {
        		"İrfan Mert Namsal",
        		"Oguz Furkan TOPRAK",
        		"Fatih Çetin",
        		"Melihcan ÖZTÜRK",
        		"MUSTAFA CAN MAVİLİ",
        		"Oğuz TAŞGIN",
        		"Buse Çankaya",
        		"Sevcan Aslan",
        		"Metehan Ölçer",
        		"Merve Adler",
        		"Mert Taser",
        		"Abdulkadir Dilmen",
        		"Muhamed Furkan Türkmen",
        		"Furkan Çitilci",
        		"Ali Öğütçen"
        };
		
		Random random = new Random();
		int sayi = random.nextInt(sinif.length);
		
		System.out.println("Şansı Kİşi--> " + sinif[sayi]);
		
		/*
		int rastgeleSayi = (int) (Math.random() * sinif.length);
		System.out.println("Şansı Kİşi--> " + sinif[rastgeleSayi]);
		*/

	}

}
