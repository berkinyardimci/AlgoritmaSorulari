package collections;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {

	static Stack<Character> chars = new Stack<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");

		String kelime = scanner.nextLine();
		palindrom(kelime);

		if (isPalindrom(kelime)) {
			System.out.println("Palindromdur");
		} else {
			System.out.println("Palindrom değildir");
		}

		// Paramtre olarak String alan ve
		// girilen metnin her bir karakterini stacki içine atan bir method yazalım
		// method ismi palindrom olsun
		// sonra bu methodu bi kullanıp çıktsınıa bakalım
		// java

		// javakursu --> palindrom değil
		// ksabask--> palindrom

		// method ismi isPalindrom
		// bu girilen kelimenini palindrom olup olmadığını bulan method
		// eğer palindromsa true
		// değilse false döndürcek

	}
	
	//16:30
	
	public static boolean isPalindrom(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i) != chars.pop()) {
				return false;
			}
		}return true;
	}
	

	public static void palindrom(String kelime) {

		for (int i = 0; i < kelime.length(); i++) {
			chars.push(kelime.charAt(i));
		}
		for (Character character : chars) {
			System.out.println(character);
		}
	}

}
