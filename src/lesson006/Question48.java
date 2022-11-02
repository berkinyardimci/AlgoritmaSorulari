package lesson006;

public class Question48 {

	public static void main(String[] args) {
	

		String[][] matris1 = { { "Bilge", "Advanced" }, { "Postgre", "Data" } };

		String[][] matris2 = { { "Adam", "Java" }, { "SQL", "Base" } };

		// BilgeAdam
		// AdvancedJava
		// PostgreSQL
		// DataBase
		
		System.out.println(matris1[0][0] + matris2[0][0]);
		System.out.println(matris1[0][1] + matris2[0][1]);
		System.out.println(matris1[1][0] + matris2[1][0]);
		System.out.println(matris1[1][1] + matris2[1][1]);
		
		
		System.out.println("******************");
		for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris2.length; j++) {
				System.out.println(matris1[i][j] + matris2[i][j]); //BilgeAdam
			}
		}
	}

}
