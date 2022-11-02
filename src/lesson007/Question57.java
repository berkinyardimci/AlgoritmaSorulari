package lesson007;

import java.util.Scanner;

public class Question57 {

	public static void main(String[] args) {

		// max ve min değerini bulcaz
		// string den int
		// arrayin uzunluğu kadar int array oluşturalım

		// java String to int
		
		//java8 ile birlikte (Stream Api)
		/*
		String dizi = "0 12 5 0 1";
		for (int i = 0; i < dizi.length; i++) {
			String harf = dizi.charAt(i);
			array1[i] = harf;
		}
		
		String[] array1 = {{"0","0","0","0","0"}};
		*/
	
		
		
		String[] array = { "5", "2", "3", "4", "99", "85" };
		int sayilar[] = new int[array.length];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			sayilar[i] = Integer.parseInt(array[i]);
			
			if(sayilar[i] >max) {
				max = sayilar[i];
			}
			if(sayilar[i]<min) {
				min = sayilar[i];
			}
		}
		System.out.println("max: " + max + " min: " + min);

	}

}
