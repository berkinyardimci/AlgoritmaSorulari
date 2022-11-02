package lesson007;

public class Question59 {

	public static void main(String[] args) {
		
		
		
		
		// topla methodu
		
		// public static void topla(){}
		//iki sayının toplamı (toplam neyse o)
		
		int toplam = topla(5,3);
		
		if(toplam<10) {
			System.out.println("sayi 10 dan küçük");
		}else {
			System.out.println("sayi 10dan büyük veya eşit");
		}

	}
	
	protected static int topla(int num1, int num2) {
		
		int toplam = num1 + num2;
		System.out.println("toplamları--> " + toplam);
		return toplam;
	}
	
	/*
	public static void topla2(int num1, int num2) {
		
		int toplam = num1 + num2;
		System.out.println("toplamları--> " + toplam);

	}	
	*/
}
