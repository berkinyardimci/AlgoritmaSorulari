package threads;

public class Test {

	public static void main(String[] args) {
		Calisan calisan1 = new Calisan("Ahmet");
		Calisan calisan2 = new Calisan("Mehmet");
		
		calisan1.start();
		calisan2.start();
	}
}
