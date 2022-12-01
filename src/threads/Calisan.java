package threads;

public class Calisan extends Thread{
	
	private String name;
	
	public Calisan(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " Çalışıyor--> "+ (i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
//run metotdumuz 10 kere dönsün her dönüşte çalışanın ismi ni yazıp çalışyıro diye bir ibare bastıralım
//her çalışmada 1 sn gecikmeli gelsin
//mainde 2 tane thred oluşturup çalıştıralım
//Thread extedens edebilirisniz