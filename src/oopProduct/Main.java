package oopProduct;

public class Main {

	public static void main(String[] args) {
		
		//id String tutucaz.
		//id, price , stock, name olan bir product sınıf yazalım
		//bilgileriGoster methodu yazalım
		
		//products arrayi oluşturalım
		//oluşturdugumuz producları bu arrayin içine atalım
		//daha sonra bu arrayi yazdıralım
		
		//farklı pakette bi sınıf oluşturcaz
		// o sınıfın içinde random id üretcez
		//mainde id set edicez
		
		// rastgele bir id oluştrucak
		//int --> string çevirmeniz lazım
		
		Product[] products = new Product[2];
		
		String randomId = util.GenerateRandomId.generateId();
		
		Product product1 = new Product();
		product1.setName("Asus");
		product1.setProductId(randomId);
		product1.setUnitInStock(100);
		product1.setUnitPrice(3000);
		
		Product product2 = new Product();
		product2.setName("Apple");
		product2.setProductId("55555");
		product2.setUnitInStock(200);
		product2.setUnitPrice(5000);
		
		products[0] = product1;
		products[1] = product2;
		
		System.out.println("--------------");
		
		ProductManager manager = new ProductManager();

		manager.bilgilerGoster(product2);
		manager.veriTabaninaKaydet(product2);
		manager.sepeteEkle(product2);
		
		
		System.out.println("önceki ismi " + product1.getName());
		
		Product yeniIsım =manager.urunuGuncelle(product1, "HP");
		
		System.out.println("değişen isim " + yeniIsım);
		
		
		//ProductManager.bilgilerGoster(product2);
		//ProductManager.veriTabaninaKaydet(product2);
		//ProductManager.sepeteEkle(product2);
		
		
		
		//products[0].bilgileriGetir(); // --> product1.bilgileriGetir()
		
		/*
		for (int i = 0; i < products.length; i++) {
			String id = products[i].getProductId();
			System.out.println(id);
		}
		for (Product index : products) {
			index.bilgileriGetir();
		}
		*/
		
		System.out.println("**************");
		//product1.bilgileriGetir();
		//product2.bilgileriGetir();
	}
	
	
	//16:00
}
