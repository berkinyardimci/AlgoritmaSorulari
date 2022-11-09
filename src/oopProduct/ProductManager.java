package oopProduct;

public class ProductManager {
	
	public void bilgilerGoster(Product product) {
		System.out.println("Name--> " + product.getName() + 
				" ID--> " + product.getProductId() +
				" PRice--> "+ product.getUnitPrice()+
				" Stoc--> " + product.getUnitInStock());
	}
	
	//veriTabanınaKaydet()
	//asus veritabanına kaydedildi diye consola çıktı versin
	
	public void veriTabaninaKaydet(Product product) {
		System.out.println(product.getName() + " Veritabanına Kaydedildi");
	}
	
	//sepeteEkle()
	//asus sepete eklendi diye consola çıktı versin
	public void sepeteEkle(Product product) {
		System.out.println(product.getName() + " Sepete Eklendi");
	}
	
	//ürün ismini güncelle methodu
	//Apple --> applem2
	
	
}
