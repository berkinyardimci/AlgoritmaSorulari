package lesson006;

import java.util.Scanner;

public class Question50 {

	public static void main(String[] args) {

		// ikiye ikilik bir matris tanımlayalım

		// bunların içine içine isimler yazaılm

		// isimleri dışardan alıcaz

		// çıktı olarak;
		// 1. grup
		// Ahmet
		// mehmet
		
		// 2. grup								
		// aslı
		// zeynep
		
		Scanner scanner = new Scanner(System.in);
		
		//String[][] birinciGrup = {{ "ahmet", "mehmet" },{ "Aslı" , "zeynep" } };
		


		String [][] birinciGrup = new String[2][2];
		for (int i = 0; i < birinciGrup.length; i++) {
			for (int j = 0; j < birinciGrup.length; j++) {
				System.out.println("isim : ");
				birinciGrup[i][j] = scanner.nextLine();
			}
		}
		
		for (int i = 0; i < birinciGrup.length; i++) {
			System.out.println(i+1 + ". Grup ");
			
			for (int j = 0; j < birinciGrup.length; j++) {
				System.out.println(" ****"+ birinciGrup.length);
				System.out.println(birinciGrup[i][j]);
			}
		}
		
		/*
		Scanner scanner2 = new Scanner(System.in);
		
		String [][] isimler = new String [2][2];
		
		System.out.println("1. grup için 2 kişi girin");
		isimler[0][0] = scanner.nextLine();
		isimler[0][1] = scanner.nextLine();
		
		System.out.println("2. grup için 2 kişi girin");
		isimler[1][0] = scanner.nextLine();
		isimler[1][1] = scanner.nextLine();
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.println(i+1 + ".  Grup ***************");
			
			for (int j = 0; j < isimler.length; j++) {
				
				System.out.println(isimler[i][j]);
			}
		}
		*/
		
		
	}

}
