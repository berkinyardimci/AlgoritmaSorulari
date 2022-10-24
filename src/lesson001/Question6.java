package lesson001;

import java.util.Scanner;

public class Question6 {
public static void main(String[] args) {
	
	// kullanıcıdan alınan vize ve final notlarını hesaplayarak öğrencinin geçip geçmediğini bulan program
	
	//vize %40
	//finalinde %60
	// ortalama hesaplancak
	// 50  den büyük ve eşit ise geçti
	// 50 den küçükse kaldı
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Vize notnu giriniz: ");
	int vize = scanner.nextInt();
	float hesaplananVize = vize * 0.4f;
	
	System.out.println("Final notunu girin: ");
	int finalNotu = scanner.nextInt();
	float hesaplananFinal = finalNotu * 0.6f;
	
	float toplam = hesaplananVize + hesaplananFinal;
	
	if(toplam>=50) {
		System.out.println("Geçtiniz puanınız-->" + toplam);
	}else {
		System.out.println("Kaldınız puanınız--> "+ toplam);
	}
	
	//15:45 
}
}
