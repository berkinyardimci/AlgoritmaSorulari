package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileOrnek3 {
	
	static ArrayList<Calisan> calisanlar = new ArrayList<>();
	public static void main(String[] args) {
		// bitane çalışan sınıfımız olcak
		// int maas ve string isim değerleri olsun
		// bu verilen dosyadaki verileri
		// maaşa göre sıralayıp farklı bir dosyaya atıcaz
		// dosyamız sıralıMaaslar olsun
		// calisanlar arraylisti açın
		// new calisan olusturup arraylistin içine atalım
		// verileriin çıktısını alalım
		
		//sıralama yapcaz
		//Collection.sort nasıl kullanılır Comparator.
		//

		metinOku();
		
		
	}
	
	
	public static void metinOku() {
		Scanner scanner = null;
		String okunan = "";
		
		try {
			scanner = new Scanner(new BufferedReader(new FileReader("calisanlar.txt")));
			while(scanner.hasNextLine()) {
				okunan=scanner.nextLine();
				
				String array[] = okunan.split(" ");
				int maas = Integer.parseInt(array[1]);
				String isim = array[0];
				Calisan geciciCalisan = new Calisan(maas, isim);
				calisanlar.add(geciciCalisan);
				
			}
			System.out.println(calisanlar);
			System.out.println(calisanlar.size());
			
			//
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//collect - tolist farkı
		
		//reversed methodu küçükten büyüğe sıraladık
		List<Calisan> listMaas = calisanlar.stream().sorted(Comparator.comparingInt(Calisan::getMaas).reversed()).collect(Collectors.toList());
		System.out.println(listMaas);
		
		//listMaas ın içindeki verileri 
		//farklı bir dosyaya yazdıralım
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("calisanlarmaas.txt",true))){
			
			for (Calisan calisan : listMaas) {
				writer.write(calisan.getIsim() + " " + calisan.getMaas());
				writer.newLine();
				writer.flush();
			}
			
		} catch (Exception e) {
			
		}
	}
		
	

}

class Calisan{
	private int maas;
	private String isim;

	public Calisan(int maas, String isim) {
		super();
		this.maas = maas;
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Calisan [maas=" + maas + ", isim=" + isim + "]";
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
}