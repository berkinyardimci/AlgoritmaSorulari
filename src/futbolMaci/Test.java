package futbolMaci;

public class Test {

	public static void main(String[] args) {
		//DefansOyuncusu defans1 = new DefansOyuncusu("Ali", 1);
		//System.out.println(defans1);
		
		/*
		Takim takim1 = new Takim("Ev Sahibi");
		for (Oyuncu oyuncu : takim1.getOyuncuListesi()) {
			System.out.println(oyuncu);
		}
		*/
		Mac mac = new Mac();
		mac.oyna(mac.takimList.get(0));
	}
}
