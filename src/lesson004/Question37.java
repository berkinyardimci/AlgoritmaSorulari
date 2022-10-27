package lesson004;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		
		// verilen kelimenin içinde kaç tane e oldugunu bulan program
		//for loop
		
		/*
		String kelime = "aaaeeeeccsseeeeeeeee";
		
		int sayac =0;
		for(int i =0; i < kelime.length(); i++) {
			if(kelime.charAt(i) == 'e') {
				sayac ++;
			}
		}
		System.out.println(sayac + " Kere kullanıldı");
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		String kelime = scanner.next();
		
		System.out.println("Hangi kelimeyi saymak istiyosunuz");
		String istenen = scanner.next();
					
		int toplam = 0;
		
		for(int i = 0; i< kelime.length();i++) {
			if(kelime.charAt(i) == istenen.charAt(0)) {
				toplam++;
			}
		}
		System.out.println(toplam);	
	}
	
	// kelimeyi kullanıcdan alcaz-->  javaaa
	// hangi kelimeyi saymak istiyosunuz--> (a)
	
	//4 tane a var
	


}
