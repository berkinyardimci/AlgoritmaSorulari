package collections;

import java.util.ArrayList;

public class ArrayListOrnek1 {
	public static void main(String[] args) {

		ArrayList<String> sehirlerArraList = new ArrayList<>();
		sehirlerArraList.add("karan");
		sehirlerArraList.add("İstanbul");
		sehirlerArraList.add("Bursa");
		sehirlerArraList.add("Antalya");
/*
		for (int i = 0; i < sehirlerArraList.size(); i++) {
			String sehirler2 = sehirlerArraList.get(i);
			if (sehirler2.toLowerCase().startsWith("an")) {
				sehirler2 = sehirler2.replace("an", "xxx");
				System.out.println(sehirler2);
			}
		}
		*/
		
		for (int i = 0; i < sehirlerArraList.size(); i++) {
			if(sehirlerArraList.get(i).toLowerCase().startsWith("an")) {
				sehirlerArraList.set(i, "xxx");
			}
		}for (String string : sehirlerArraList) {
			System.out.println(string);
		}
	}

	// Birtane array list oluşturalım daha sonra bu arraylistin içine bi kaç tane
	// şehir adalım
	// daha sonra bu liste içinde an ile başlayan var ise bunu "xxx" ile
	// değiştirelim.

}
