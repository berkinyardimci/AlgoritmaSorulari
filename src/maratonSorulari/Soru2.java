package maratonSorulari;

public class Soru2 {
	public static void main(String[] args) {
		
		System.out.println(karakterSayisi("Bugün güzel bir gün", 'g'));
		System.out.println(karakterSayisi("Bugün güzel bir gün", 'x'));
		System.out.println(karakterSayisi("", 'x'));

	}
	public static int karakterSayisi(String s, char c) {
		int bulunanKarakterSayisi = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				bulunanKarakterSayisi++;
			}
		}
		return bulunanKarakterSayisi;
	}
	
}
