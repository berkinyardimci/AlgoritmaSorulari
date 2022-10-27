package lesson004;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// kullanıcadn bi kelime alalım (java)
		
		// 0 inci indexi j
		// 1. indexi a
		// 2. indexi v
		//3 .indexi a

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kelime girin: ");
		String kelime = scanner.nextLine();
		
		for(int i = 0; i<kelime.length(); i++) {
			System.out.println(i +". indexi: " + kelime.charAt(i));
		}
	}

}
