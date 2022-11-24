package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiOrnek3 {
	public static void main(String[] args) {
		
		//15:47
		
		Kisi kisi1 = new Kisi("ahmet", 51, ECinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("mehmet", 18, ECinsiyet.ERKEK);
		Kisi kisi3 = new Kisi("aslı", 25, ECinsiyet.KADİN);
		Kisi kisi4 = new Kisi("zeynep", 32, ECinsiyet.KADİN);
		Kisi kisi5 = new Kisi("ali", 65, ECinsiyet.ERKEK);
		List<Kisi> kisiler = new ArrayList<>();
		
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		
		
		//kadın olanları farklı bir listeye atıcaz sonra bu listeyi yazdıralım
		System.out.println("Kadın olanlar******");
		List<Kisi> kadinlar = kisiler
				.stream()
				.filter(kadin->kadin.getCinsiyet() == ECinsiyet.KADİN).collect(Collectors.toList());
		System.out.println(kadinlar);
		
		//Kişileri yaşlarına göre sıralayalım farklı bir listeye atıp yazdıralım
		//.sorted Comparator.comparing() internetten.
		System.out.println("************");
		List<Kisi> siralanmisKisiler = kisiler
				.stream()
				.sorted(Comparator.comparing(Kisi::getAge)).collect(Collectors.toList());
		siralanmisKisiler.forEach(System.out::println);
		
		//isim ve yas değerlerini bir map yapısana atıp mapi yazdıralım
		Set<String> isimYas = kisiler
				.stream()
				.map(kisi -> kisi.getName() + " " + kisi.getAge()).collect(Collectors.toSet());
		isimYas.forEach(System.out::println);
		
		System.out.println("************");
		Map<String, Integer> userMap = kisiler
				.stream()
				.collect(Collectors.toMap(kisi -> kisi.getName(), kisi->kisi.getAge()));
		userMap.forEach((key, value)-> System.out.println(key + " " + value)) ;
		
		//50 yaş üstü insalnlar için 50yaş üstü methodunu yazdıralım
		
		//Ahmet 51
		//mehmet 18
		
		
	}
	
	
	//isim ve yas değerlerini
	
}
