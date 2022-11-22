package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {
	public static void main(String[] args) {
		
		//16:10
		
		
		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
		int[] notlar = { 60, 80, 70 };

		int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

		// Ayşe = 60,
		// Ece = 80

		// 1
		Map<String, Integer> map1 = new LinkedHashMap<>();

		for (int i = 0; i < notlar.length; i++) {
			map1.put(ogrenci[i], notlar[i]);
		}
		// Niye Entry set kullanıyoruz araştırma ödevi

		System.out.println(map1.keySet());
		for (Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("*****************");
		// 2
		// hash code sıralanıyo

		Map<String, int[]> map2 = new HashMap<>();
		for (int i = 0; i < 3; i++) {

			map2.put(ogrenci[i], notlar2[i]);
		}

		for (Entry<String, int[]> entry : map2.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i] + " ");
			}
		}

		// 3
		//String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
		//int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
		
		Map<String, List<Integer>> map3 = new HashMap<>();
		
		//map3
		//Ayşe , notlarList.
		//Ayşe, 50,50,60
		//key, value
		for (int i = 0; i < 3; i++) {
			List<Integer> listNotlar = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				listNotlar.add(notlar2[i][j]);
			}
			map3.put(ogrenci[i], listNotlar);
		}
		System.out.println(map3);
		for(Entry<String, List<Integer>> entry: map3.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
