package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Taksi implements Runnable {

	int id;
	long musteriBirakmaSuresi;
	List<Integer> musterIdleri = new ArrayList<>();
	long musteriSayisi;

	public Taksi(int id) {
		Random random = new Random();
		this.musteriBirakmaSuresi = random.nextLong(1000, 2000);
		this.id = id;
	}

	@Override
	public void run() {
		// kuyruk boşalana kadar müşteri alcaz
		// musteriNo bulcaz durak tan her çıkardığımız müşterinin nosu
		// musterIdleri.add(musteriNo)

		while (!Durak.kuyruk.isEmpty()) {
			int musteriNo = Durak.kuyruk.poll();
			musterIdleri.add(musteriNo);
			System.out.println(id + ".Taksi --> " + musterIdleri.size() + ".müsterisini aldı-->" + musteriNo);
			try {
				Thread.sleep(musteriBirakmaSuresi);
			} catch (Exception e) {

			}
			
		}
		musteriSayisi = musterIdleri.size();
		System.out.println(id + ". Taksi " +"Toplam " +musteriSayisi + " Müşteri aldı");
	}

	// * Durağımızda toplam 10 adet taksi olsun ve durak onunde 100 kişilik
	// * bir müşteri kuygrugu(queue) olsun bu musterilerimiz için sınıf yaratmayalım
	// * bir int bir id değeri olarak tutalım
	// *
	// * 10 adet taksimiz hızlarına göre kuyruktan sırayla musteri alacaklardır

	// Takside run methodunu override edelim
	// taksilere müşteri alcaz
	// müşterileri duraktaki kuyruktan alcaz
	// ve aldığımız müşterileri listeye atıcaz
	// taksini her müşteri aldığında hangi taksinin kaçıncı müşterisini aldığını
	// yazdıralım

}
