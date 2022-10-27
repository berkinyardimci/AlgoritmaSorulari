package lesson004;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// Girilen kelimenin ilk önce hepsini Büyük harfe çevirip
	
		// daha sonra hepsini küçük harfe çeviren program
		// Girdiğimiz kelime java
				
		// Aşağıdaki çıktıyı veren
		// Hepsi Büyük -->  JAVA
		// Hepsi Küçük --> java
		
		
		Scanner scanner = new Scanner(System.in);
        String kelime = scanner.next();
        
        String upper = kelime.toUpperCase();
        System.out.println(" Hepsi Büyük "+ upper);
        
        String lowers = kelime.toLowerCase();
        System.out.println("Hepsi Küçük " + lowers);
		
        // aynı şey
        //System.out.println("Hepsi Küçük " + kelime.toLowerCase());
	}

}
