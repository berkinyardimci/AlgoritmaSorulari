package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
	
		// telfona ve maile bir kod gelecek
		// kullanicadn emaile gelen kodu ve telefona gelen kodu alcaz
		// bunları karşılaştırcaz
		
		// ikiiside uyuşuyosa sisteme kaydoldunuz
		// telefonu doğru emaili yanlış --> emaili yanlış girdiniz
		// emaili doğru telefonu yanlış girmiş olabilir --> telefonu yanlış girdiniz
		
		// ikisinide yanlış girmiş olabilir telefonu ve maili yanlış girdiniz
		
		int mailKod = 555;
		int telefonKod = 321;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Emailinize gelen kodu giriniz :");
		int x1 = scanner.nextInt();
		
		System.out.println("Telefonunza gelen kodu giriniz :");
		int x2 = scanner.nextInt();
		
		
		if(x1 == 555 && x2 ==321) {
			System.out.println("Sisteme kayıt oldunuz");
		}
		else if(x1 != 555 && x2 == 321) {
			System.out.println("email kodunuz hatalı girdiniz");
		}
		else if(x1 == 555 && x2 != 321) {
			System.out.println("telefon kodunuz hatalı girdiniz");
		}else {
			System.out.println("iki kodda hatalı girdiniz");
		}
		

	}

}
