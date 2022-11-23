package tryExcept;

import java.util.Scanner;

public class TryExceptionOrnek1 {
	public static void main(String[] args) {
	
		
		String[] array = { "6", "10", "bc", null, "20" };
		
		//elemaniGetir(array);
		System.out.println(sum2(array));
	}
	
	//parametre olarak array alan ve girdiğimiz değere karşılık gelen indexi yazdıran bir method yazalım
	//kullanıcının girdiği değer hangi indexe karşılık geliyosa o indexi bize yazdırsın
	//girdiğimiz değer indexi aşıyorsa bu hatayı yakalayalım
	//try except kullanalım
	
	//Array içinde gezelim sayısal değerleri int e çevirip bir toplama işlemi yapalım
	//döngü sonunda sayıların toplamını ve toplam hata sayısını yazdıralım
	
	
	public static void elemaniGetir(String[] array) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("kaçıncı indexi getirelim ");
			int cevap = scanner.nextInt();
			System.out.println(array[cevap]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiğiniz sayı dizinin boyutlarını aşmıştır");
			System.out.println("Sadece e li " + e);
			System.out.println("Get mesajlı kısım " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Beklenmedik bir hata oluştu " +e.getMessage());
		}
	}
	
	public static String sum(String[] array) {
		int count =0;
		int exceptionCount =0;
		for (String string : array) {
			try {
				int a = Integer.parseInt(string);
				count +=a;
			} catch (Exception e) {
				//System.out.println("Cannot parse " + string);
				System.out.println(e.getMessage());
				exceptionCount++;
			}
		} 
		String message = "Array sayılar toplamı " + count + " Hatalı pars işlemi sayısı " +exceptionCount;
		return message;
	}
	
	public static String sum2(String[] array) {
		int count =0;
		int exceptionCount =0;
		for (String string : array) {
			try {
				nullCheck(string);
				int a = Integer.parseInt(string);
				count +=a;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				//System.out.println(e.getMessage());
				exceptionCount++;
			}
		}
		String message = "Array sayılar toplamı " + " "+ count + "Hatalı pars işlemi sayısı " +exceptionCount;
		return message;
	}
	
	//aynı methodu kopyalıyalım
	//sum2 methodunda birde null hatasını yönetelim yani null değer var ise arreyde bize hata fırlatsın
	
	//methodun ismi -->nullCheck methodu oluşturalım
	//null kontrolu yapcaz
	
	
	public static String nullCheck(String string)  {
		if (string == null) {
			throw new NullPointerException("Null olamazzzz!");
		}
		return string;
	}
}
