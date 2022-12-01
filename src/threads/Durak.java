package threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak {
	//100 tane yolcu
	//10 tane  taksi
	
	List<Taksi> taksiList = new ArrayList<>();
	
	static Queue<Integer> kuyruk = new LinkedList<>();
	
	public Durak() {
		this.kuyrukOlustur();
		this.taksiOlustur();
	}
	
	private void kuyrukOlustur() {
		for (int i = 1; i < 101; i++) {
			kuyruk.offer(i);
		}
		System.out.println("Kuyruk oluştu");
	}
	
	private void taksiOlustur() {
		for (int i = 1; i < 11; i++) {
			taksiList.add(new Taksi(i));
		}
		System.out.println("Taksiler oluştu");
	}
	
	public void musteriAl() {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(taksiList.get(i));
			thread.start();
			
		}
	}
	
	public static void main(String[] args) {
		Durak durak = new Durak();
		
		durak.musteriAl();
	}
	
}


