package oopPizza;

public class Main {

	public static void main(String[] args) {
		
		//Encapsulation
		//private --> getter setter.
		//istediğimiz verilerin kullanımını kısıtladığımız bir prensip
		//getter ve setter ile çözüyoruz.
		
		//Abstraction
		//Inheritance
		//Polymorphism
		
		//Pizza sipariş uygulaması
		//attrubute lerimiz price ve vejeteryan mı normal mi?
		// Pizza vejeteryan mı normal mi
		//vej ise fiyat 300 tl normal ise 200tl. constructor da belirlicez
		
		//methodlar
		//4 tane method
		
		//sosEkle methodu--> 50 tl
		//peynir ekle --> 100 tl
		// eveSiparişVer --> 20 tl
		// fişAl --> toplam pizza fiyatını göstercek.
		
		
		//sosCıkar --> fiyat 50 tl düşücek
		//peynircıkar --> fiyat 100 tl düşecek
		
		//pizzalar diye array oluşturalım
		//oluşturdugumuz pizza nesnenlerini bu arrayin içine atcaz
		//arreyde 400 tl den fazla olan pizzaları consola bastırcaz
		
		Pizza[] pizzalar = new Pizza[4];
		
		Pizza pizza1 = new Pizza(false);
		Pizza pizza2 = new Pizza(true);
		Pizza pizza3 = new Pizza(true);
		Pizza pizza4 = new Pizza(false);
		
		pizzalar[0] = pizza1;
		pizzalar[1] = pizza2;
		pizzalar[2] = pizza3;
		pizzalar[3] = pizza4;
		
		PizzaTercihleri pizzaTercihleri = new PizzaTercihleri();
	
		pizzaTercihleri.sosEkle(pizza1);
		pizzaTercihleri.peynirEkle(pizza1);
		pizzaTercihleri.peynirEkle(pizza4);
		pizzaTercihleri.peynirEkle(pizza1);
		pizzaTercihleri.peynirEkle(pizza4);
		pizzaTercihleri.peynirEkle(pizza1);
		pizzaTercihleri.peynirEkle(pizza4);
		pizzaTercihleri.peynirEkle(pizza1);
		pizzaTercihleri.sosEkle(pizza1);
		pizzaTercihleri.eveSiparisVer(pizza1);
		pizzaTercihleri.fisAl(pizza1);
		pizzaTercihleri.sosEkle(pizza2);
		pizzaTercihleri.peynirEkle(pizza2);
		pizzaTercihleri.peynirEkle(pizza3);
		pizzaTercihleri.peynirEkle(pizza3);
		pizzaTercihleri.sosEkle(pizza2);
		pizzaTercihleri.peynirCikar(pizza3);
		pizzaTercihleri.eveSiparisVer(pizza4);
		pizzaTercihleri.fisAl(pizza1);
		
		
		for (int i = 0; i < pizzalar.length; i++) {
			if(pizzalar[i].getFiyat() < 500) {
				System.out.println("fiyat --> " + pizzalar[i].getFiyat());
			}
		}
		
		
		
		// 15:30
	}

}
