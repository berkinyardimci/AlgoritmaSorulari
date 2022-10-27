package tekrar;

public class Question4 {

	public static void main(String[] args) {
		
		
		String name = "bilgeadam";
		System.out.println(name.length());
		
		for (int i = 0; i <= name.length(); i++) {
			
			System.out.print(name.charAt(i) );
			
			if(i != name.length()-1) {
				System.out.print(",");
			}
		}
		
		
		// for loop
		// b,i,l,g,e,a,d,a,m
		
	}

}
