package tekrar;

public class Question1 {

	public static void main(String[] args) {
		
		//Çıktı --> 1 , 2 , 3,4,5,6,7,8,9,10
	
		for(int i =1 ; i<=10; i++) {
			System.out.print(i);
			if(i != 10) {
				System.out.print(",");  
			}
		}
	}

}
