package oopBanka;

public class Main {

	public static void main(String[] args) {
		
		Account account1 = new Account();
		
		AccounManager accounManager = new AccounManager();
		AdminManager adminManager = new AdminManager();
		
		User user1 = new User("ahmet","kaya",account1);

		accounManager.paraYatir(account1, 500);
		accounManager.paraYatir(account1, 2000);
		//accounManager.paraYatir(account1, 120000);
		//System.out.println(account1.getBakiye());
		accounManager.paraCek(account1, 1000);
		accounManager.hesapBilgileriniGoster(account1);
		
		UserManager userManager = new UserManager();
		userManager.otomatikEmailOlustur(user1);
		userManager.bilgileriGoster(user1);
		
		userManager.krediBasvurusundaBulun(account1, 10000); //true
		
		adminManager.krediBasvurusunuOnayla(account1); // false
		accounManager.hesapBilgileriniGoster(account1);
		
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.bilgileriGoster(user1);
		
		userManager.hesaptanKrediKartiBorcuOdeme(account1, 2000);
		userManager.bilgileriGoster(user1);
		
		userManager.nakitAvansCek(account1);
		userManager.bilgileriGoster(user1);
		
		
		
		//Atm uygulaması
		
		//Account sınıfı oluşturcaz attrubuteleri --> accounNo ve money
		//para yatır ve para çek metotlarını yazalım
		//para çekerken eğer hesapta o kadar para yoksa para çekemicez
		//para yatır metodunda hesaba en fazla 10.000 tl yatırabilcez
		//her para çek ve yatır işlemlerinde bakiyemiz güncellenecek
		
		//çıktı paraYatır--> 100 tl yatırdınız güncel bakiyeniz 100
		//çıktı paraYatır--> 200 tl yatırdınız güncel bakiyeniz 300
		//çıktı paraYatır--> 10.00 tl den fazla para yatırmazsınız
		
		//çıktı paraCek --> 100 tl çektiniz güncel bakiyeniz 200
		//çıktı paraCek --> hesapta o kadar para yok
		
		//hesapBilgileriGoster--> 
		//hesap no ve bakiyeyi versin
		
		// User sınıfı oluşturalım
		//attrubute --> name , surname , email , account
		// mainde User account bağlayım
		
		
		// name surname değerlerini alıyoruz
		//gelen name ve surname değerlerini alıp
		//otomatik bir email adresi oluşturalım
		
		// UserManager --> otomatikMailOlustur()
		//ahmet.kaya@xbanka.com
		
		//UserManager
		//Account attrubute 
		//private boolean krediBasvurusu;
		//private int istenenKredi;
		
		// krediBaşvurusu(Account account , int para)
		//account1 10000;
		//kredi başvurusunda buluncak
		
		
		//AdminManager diye sınıf oluşturalım
		//krediBasvursunuOnayla()
		//eğer o an kredi başvurusu yoksa--> Henüz kredi başvurusu yapılmamış
		//kredi başvursu varsa  başvurunuz onaylanmaıştır çıktısı ve
		//güncel bakiyemize çektiğimiz kredi kadar ekleme yapılcak
		
		//krediBasvursunuOnayla()
		
		//Account Nesne oluşturunca otomatik bize Id String olarak
		
		//Dışardan nakit kredi kartı borcunu öde methodu yazalım
		//eğer user'ın çekmiş oldugu kredi yoksa ve ya kredi başvurusu reddedilmiş ise
		// Bu işlemi geçkleştiremiyoruz diye output verelim
		//çekilmiş kredi var ise parametre olarak girilen miktar kadar borç ödenmiş olsun 
		//ve kredi kartı borcundan düşülsün
		//daha sonra güncel kredi kartı borcunuz ... diye output versin
		
		
		//Hesaptan borç ödeyelim
		//hesap seçiyosunuz o hesaptan parayı alıp borca yatırıyo
		
		//her kart borcumuzu ödediğimiz
		//Accountun kredi puani 10 puan artsın
		
		//Nakit avans çekicez
		//nakit avans çekmemiz için bizim kredi Notumuzun 50 den fazla olması lazım
		//eğer 50 den fazla ise hesaptaki paranın yarısı kadar nakit avans almış olcaz
		//50 den az ize kredi notunuz yetersizdir kredi notmuzu bastırsın
	}

}
