package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	public static void main(String[] args) {
		System.out.println("Bir kelime Giriniz:");
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();

		Set<Character> tekrarEden = new HashSet<Character>();
		Set<Character> tekrarEtmeyen = new HashSet<Character>();
		
		Set<Character> deneme = new HashSet<Character>();
		
		
		//setlerin içinde unique veri tutabiliyoduk
		//boş
		//java i=3
		//tekrarEtmeyenler --> j , v
		//tekrar eden --> a
		
		
		for (int i = 0; i < kelime.length(); i++) {
			if (!tekrarEden.contains(kelime.charAt(i)) && !tekrarEtmeyen.add(kelime.charAt(i))) {
				tekrarEden.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
			}
		}

		System.out.println("TekrarEdenler");
		for (Character character : tekrarEden) {
			System.err.print(character + " ,");
		}
		System.out.println();
		System.out.println("Tekrar Etmeyenler");
		for (Character character : tekrarEtmeyen) {
			System.err.print(character + " ,");
		}

		// 2 tane set oluşturalım
		// tekrar edenler ve
		// tekrar etmeyenler
		// kullanıcdan bir kelime alcaz
		// eğer tekrar eden harf varsa tekrar edenlere atalım
		// ve tekrar etmeyenlerden çıkaralım
		// ve tekrar edenleri ve etmeyenleri yazdıralım
	}
	/*
	Scanner scanner = new Scanner(System.in);
    System.out.println("Bir kelime giriniz.");
    String kelime = scanner.nextLine();
    
    HashSet<Character> tekrarEdenler = new HashSet<Character>();
    HashSet<Character> tekrarEtmeyenler = new HashSet<Character>();
            
    
    for (int i = 0; i < kelime.length(); i++) {
        for (int j = i+1; j < kelime.length(); j++) {
            if(kelime.charAt(i)== kelime.charAt(j)) {
                tekrarEdenler.add(kelime.charAt(i));
            }
        }
        if(!tekrarEdenler.contains(kelime.charAt(i))) {
            tekrarEtmeyenler.add(kelime.charAt(i));
        }
    }
    System.out.println(tekrarEdenler);
    System.out.println(tekrarEtmeyenler);
*/
}
