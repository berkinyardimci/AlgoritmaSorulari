package maraton2;

public class CustomString {
	
	String kelime;

	public CustomString(String kelime) {
		super();
		this.kelime = kelime;
	}
	
	public int uzunluk() {
		return kelime.length();
	}
	
	public int belirtilenIndexiGoster(char char1) {
		return kelime.indexOf(char1);
	}
	
	public boolean iceriyoruMu(String string) {
		return kelime.contains(string);
	}
	
	//14:37
}
