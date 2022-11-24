package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {
	public static void main(String[] args) {
		
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(48);
		sayilar.add(30);
		sayilar.add(25);
		sayilar.add(17);
		
		//5 ile bölünen sayıları bir listeye atalım ve listeyi yazdıralım
		List<Integer> kalansizBeseBolunenler = sayilar.stream().filter(sayi -> sayi%5 ==0).collect(Collectors.toList());
		System.out.println(kalansizBeseBolunenler);
		
		//sayıların kendisi ile çarpıp yeni bir listeye atalım
		List<Integer> carpimlari = new ArrayList<>();
		sayilar.stream().forEach(sayi-> carpimlari.add(sayi*sayi));
		System.out.println(carpimlari);
		//mapli çözüm
		List<Integer> carpimlari2 = sayilar.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(carpimlari2);
		
		//kaç tane 5 e bölünen sayı var onu bulalım
		
		long beseBolunen = sayilar.stream().filter(sayi -> sayi%5 ==0).count();
		System.out.println(beseBolunen);
	}
}
