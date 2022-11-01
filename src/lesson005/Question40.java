package lesson005;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		
		// Bizden bir kelime istenilcek (java)
		// hangi harfi değiştirmek istediğimizi sorcak (b)
		// eğer değiştirmek istediğimiz kelimeda yoksa,
		// döngü başa saracak ve tekrar kelime isteyecek eğer
		// varsa harfimiz değişecek
		// ve yeni kelimemiz ekrana basılcak
		
		//java
		// değiştirmek istediğiniz harf --> a
		//neyle değiştirmek istediğimiz harf --> b
		
		//jbvb
		
		
		Scanner scanner = new Scanner (System.in);
		/*
		while(true) {
			System.out.println("bir klime giriniz");
			String kelime = scanner.nextLine();
			
			System.out.println("hangi harfi değiştirmek isterseniz");
			String harf = scanner.nextLine();
			
			System.out.println("yerine geçmesini istediğiniz harf");
			String harf2 = scanner.nextLine();
			
			int i = 0;
			boolean check = true;
			int kelimeUzunlugu = kelime.length();
			System.out.println(kelime.indexOf(harf, i) == -1);
			
			while(check) {
				if(!(kelime.indexOf(harf, i) == -1 )) {
					kelime.replace(harf, harf2);
					System.out.println(kelime.replace(harf, harf2));
					check = false;
				}else {
					System.out.println("Seçtiğiniz harf kelimede yok");
					check = false;
				}
			}
		}
		*/
		boolean check = true;
		while (check) {

			System.out.println("lütfen bir kelime giriniz ");
			String kelime = scanner.nextLine();

			System.out.println("Hangi harfi değişltirmek istersiniz");
			String oldLetter = scanner.nextLine();

			if (kelime.contains(oldLetter)) {
				System.out.println("Yeni harf ne olsun");
				String newLetter = scanner.nextLine();
				kelime = kelime.replace(oldLetter, newLetter);
				System.out.println("Kelimenizin son hali " + kelime);
				check = false;
			} else {
				System.out.println("Girdiğiniz Harf Kelimenizde yoktur");
			}
		}
		
		
	}

}
