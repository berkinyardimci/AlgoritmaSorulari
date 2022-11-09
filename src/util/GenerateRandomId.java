package util;

import java.util.Random;

public class GenerateRandomId {
	
	//method
	// rastgele bir id oluştrucak
	//int --> string çevirmeniz lazım
	
	//rastgele bi sayı oluşturcaz
			//oluşturduğumuz sayıyı Stringe çevircez
			//bu String ifadeyi return etcez
			
	
	public static String generateId() {
		Random rastgele = new Random();
		
		int randomId = rastgele.nextInt(1000);
		String randomId1 = String.valueOf(randomId);
		return randomId1;
	}
}
