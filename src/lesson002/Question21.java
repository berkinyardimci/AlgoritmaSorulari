package lesson002;

public class Question21 {
	public static void main(String[] args) {
		
		// 1 den 100e kadar çift sayıların toplamını tek sayılırn toplamına oranı bulan program
		
		double tekToplam = 0;
		double ciftToplam =0;
		
		for(int i = 0; i<101; i++) {
			if(i % 2==0) {
				ciftToplam +=i;
			}else {
				tekToplam +=i;
			}
		}
		
		double oran = ciftToplam / tekToplam;
		
		System.out.println(oran);
	}
}
