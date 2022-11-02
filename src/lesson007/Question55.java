package lesson007;

public class Question55 {

	public static void main(String[] args) {

		// verilen iki farklı arrayde iki arraydede tekrar eden sayıları bulan program
		// 50
		// 60
		// 3
		// 8
		// 9

		int array1[] = { 50, 60, 3, 4, 3, 9, 8 ,7, 45, 95};
		int array2[] = { 1, 2, 50, 60, 3, 8, 9, 7,88,95 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}

}
