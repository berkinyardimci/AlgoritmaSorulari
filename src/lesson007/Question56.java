package lesson007;

public class Question56 {

	public static void main(String[] args) {

		// verilen dizide rakamların farkının en az olduğu sayıların farkı
		// 2
		
		int[] array = { 1, 5, -4, 3 };

		int min = Integer.MAX_VALUE;
		int n = 0;
		int m = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					if (Math.abs(array[i] - array[j]) < min) {
						min = Math.abs(array[i] - array[j]);
						m = i;
						n = j;
					}
				}
			}
		}
		System.out.println("indexler :" + m + " ve " + n + " en kısa meseafe " + min);
		
		
		
		/*
		
		int[] array = { 1, 5, -4, 4 };
		
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				int fark = Math.abs(array[i] - array[j]);
				if (fark < min) {
					min = fark;
				}
			}
		}
		System.out.println(min);
		*/
	}

}
