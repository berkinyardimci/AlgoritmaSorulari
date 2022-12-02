package maraton2File;

public class Student {

	public static void main(String[] args) {
		P p = new R();
		System.out.println(p.compute("Go"));
	}
}
class P {
	String compute(String str) {
		String yeni = str + str + str;
		return yeni;
	}
}
class Q extends P {
	String compute(String str) {
		String yeni = super.compute(str.toLowerCase());
		return yeni;
	}
}
class R extends Q {
	String compute(String str) {
		String yeni = super.compute(str.replace('o', 'O'));
		return yeni;
	}
}