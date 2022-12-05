package fileSerilization;

public class Test {
	
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		
		//manager.dosyaOku(FileUtils.ilkOkuma);
		//manager.serilize();
		//manager.desereilze();
		
		manager.veriTabaniOlustur();
		manager.kutuphane.getKitaplar().forEach(System.out::println);
		
		
		
	}
	
}
