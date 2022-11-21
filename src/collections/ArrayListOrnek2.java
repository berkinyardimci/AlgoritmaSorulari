package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek2 {
	public static void main(String[] args) {
		
		//14:50
		
		List<Integer> tekSayilar = new ArrayList<Integer>();
		List<Integer> ciftSayilar = new ArrayList<Integer>();
		
		for (int i = 0; i < 35; i++) {
			int sayi = (int) (Math.random()*101);
			if(sayi%2 ==0) {
				ciftSayilar.add(sayi);
			}else {
				tekSayilar.add(sayi);
			}
		}

		System.out.println("Çift Sayılar");
		for (Integer integer : ciftSayilar) {
			System.out.print(integer + ",");
		}
		System.out.println();
		System.out.println("Tek Sayılar");
		for (Integer integer : tekSayilar) {
			System.out.print(integer + ",");
		}
		
		
		//1 tane çift sayılar Integer arraylist açalım
		//bitde tek sayılar Integer arraylist açalım
		
		// 1 den 100 e kadar 35 tane random sayı üretelim
		//tek saylar tekler arraylistine
		//çift sayılarda çiftler arraylistene atalım
		//sonra bunları yazdıralım
	}
	
}
