package maraton2File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Kisiler> kisilerList = new ArrayList<Kisiler>();
		
		try(Scanner scanner = new Scanner (new BufferedReader(new FileReader("rehber.txt")))){
			
			while(scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();
				String [] arr = okunanSatir.split(";");
				Kisiler kisiler = new Kisiler(arr[0].substring(0, arr[0].indexOf(" ")), arr[0].substring(arr[0].indexOf(" ")).trim(), arr[1].trim(), arr[2].trim());
				kisilerList.add(kisiler);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi.");
		}
		System.out.println(kisilerList);
		Map<String, String> kisilerMap = kisilerList.stream()
				.collect
				(Collectors.toMap(a -> a.getIsim().concat(a.getSoyad()).toLowerCase(), tel -> tel.getTelNo()));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen telefonunu aradığınız kişinin adını giriniz: ");
		String girilenIsim = scanner.nextLine();
		System.out.println("Lütfen telefonunu aradığınız kişinin soyadini giriniz: ");
		String girilenSoyad = scanner.nextLine();
		
		String aratilacakIsimSoyad = girilenIsim.concat(girilenSoyad);
		
		if (kisilerMap.containsKey(aratilacakIsimSoyad.toLowerCase())) {
			System.out.println(kisilerMap.get(aratilacakIsimSoyad.toLowerCase()));
		}
		else {
			System.out.println("Aradiginiz kisi bulunamadi.");
		}
	}
}
