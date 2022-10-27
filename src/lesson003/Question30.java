package lesson003;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		//Girilen sayının, kaçıncı Basamak da oluduğu (1ler,10lar,100ler gibi ) o
		//basmak daki basamak değerini (1ler basamağı: 5 ,6 lar basmağı :3 gibi)
		
		// output --> 1 ler basamağı --> 7
		// 375
		// birler basamağı 5
		//onlar basamağı 7
		//100ler basamağı 3
		
		//while
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();
        int basamak;
        int i=1;
        while(sayi!=0) {
            basamak=sayi%10;
            sayi=sayi/10;
            System.out.println(i + " ler basamağı :" + basamak);
            i=i*10;
        }
	}

}
