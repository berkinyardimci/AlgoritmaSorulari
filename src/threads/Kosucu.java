package threads;

public class Kosucu implements Runnable {

	String name;
	int mesafe;
	long sure;

	public Kosucu(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		long baslangıc = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " "+ ((i * 10) + 10) + ". metrede ");
		}
		long bitis = System.currentTimeMillis();
		sure = bitis - baslangıc;
		System.out.println(name + " adlı kosucu 100 metreyi " + sure + " mili saniyede koştu");
	}
}
