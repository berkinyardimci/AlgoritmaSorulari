package lesson004;

public class Question36 {

	public static void main(String[] args) {
		
		//Java
		//Spring
		//Postgre
		//React
		
		// her virgülden öncesini aşağı satıra yazan program
		//substring(index, i)
		
		/*
		String string = "Java,Spring,Postgre,React";
		
		for(int i = 0; i < string.length();i++) {
			
			System.out.print(string.charAt(i));
			
			if(string.charAt(i) == ',') {
				System.out.println();
			}
		}
		*/
		/*
		String string = "Java,Spring,Postgre,React";
		
		for (int i = 0; i < string.length(); i++) {
			
			if(string.charAt(i) == ',') {
				System.out.println();
			}else {
				System.out.print(string.charAt(i));
			}
		}
		*/
		
		String string = "Java,Spring,Postgre,React";
		
		int index = 0;

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == ',') {

				System.out.println(string.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(string.substring(index));
		
		
	}
}
