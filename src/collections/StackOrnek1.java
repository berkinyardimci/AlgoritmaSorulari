package collections;

import java.util.Stack;

public class StackOrnek1 {
	public static void main(String[] args) {

		Stack<Integer> sayilar = new Stack<>();
		Stack<Integer> yeniStack = new Stack<>();
		// System.out.println(sayilar);
		// System.out.println(sayilar.size());
		sayilar.push(10);
		sayilar.push(50);
		sayilar.push(101);
		sayilar.push(110);
		sayilar.push(20);
		sayilar.push(150);
		// System.out.println(sayilar.size());

		// referansta adresi var ama içi boş
		/*
		 * for (Integer integer : sayilar) { System.out.println(integer ); }
		 * 
		 * while(!(sayilar.isEmpty())) { System.err.println(sayilar.pop()); }
		 */
		int toplam = 0;
		/*
		 * while (!(sayilar.isEmpty())) { int temp = sayilar.pop(); if (temp < 100) {
		 * toplam += temp; } else { yeniStack.push(temp); } }
		 */
		while (!(sayilar.isEmpty())) {
			if (sayilar.peek() < 100) {
				toplam += sayilar.pop();
			} else {
				yeniStack.push(sayilar.pop());
			}
		}

		System.out.println(toplam);
		for (Integer integer : yeniStack) {
			System.out.println(integer);
		}

		// Stack --> Son giren ilk çıkar (LIFO) last in first out
		// bir tane int stack oluşturalım
		// içine bir kaç tane int değer atalım
		// bu staci yazdıralım

		// stack boşalana kadar bütün elemanları çıkaralım
		// çıkarılan her elemanı yazdıralım

		// 100 den küçük değerleri toplayıp stackten çıkaralım
		// 100 den büyük değerleri ise farklı bi stack içine atıcaz
		// daha sonra hem toplam değeri hem de diğeri stacki yazdıralım

	}
}
