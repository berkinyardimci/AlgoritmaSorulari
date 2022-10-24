package lesson001;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		
		//Dairenin alanını ve çevresini bulan program
		// r(yarı çapı) yi kullanıcıdan alcaz
		
		//pi = 3.14
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("r değerini giriniz");
		
		float radius = scanner.nextFloat();
		
		System.out.println("Dairenin alanı eşittir -->" + (3.13* radius* radius));
		System.out.println("Dairenin çevresi --> " + 2 * 3.14 * radius);
	}
}
