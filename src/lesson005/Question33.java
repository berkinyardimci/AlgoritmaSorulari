package lesson005;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// Klavyeden girilen 0 ile 100 arasında 100 dahil 5 adet sayıdan en büyük 
		//ve en küçük olanı bulup ekrana yazan  program
		
		//while loop ile
		Scanner scan = new Scanner(System.in);
  
        
		int enKucuk = 101;
        int enBuyuk =-1;
        int i =0;
        while(i<5) {
            System.out.println("0 ile 100 arası bir sayı giriniz : ");
            int sayi = scan.nextInt();
            if(sayi>enBuyuk) {
                enBuyuk=sayi;
            }
            if(sayi<enKucuk){
                enKucuk=sayi;
            }    
            i++;
        }
        System.out.println("Max : "+enBuyuk+" Min : "+enKucuk);
	}

}
