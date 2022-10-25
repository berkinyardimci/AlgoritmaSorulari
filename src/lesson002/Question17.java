package lesson002;

import java.util.Scanner;

public class Question17 {
	public static void main(String[] args) {
	
	// Girilen sayıyı için çarpım tablosu yazan program
	
	//6x1 = 6
	//6x2 = 12
	//...
	//6x10 = 60
	
		/*
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bir sayı giriniz: ");
	int j = scanner.nextInt();
	int i = 0;
	int carpim = 0;
	
	for(i=0; i<=10; i++) {
		carpim = i * j;
		System.out.println(carpim);
	}
	*/
	Scanner scanner = new Scanner(System.in);
	System.out.print("1den 10 a kadar bir sayı giriniz: ");
	
    int sayi = scanner.nextInt();
	for(int i=1; i<=10; i++)
    {
        System.out.println(sayi +" x " + i + " = " + (sayi*i));
    }
	
	
	/*
	for(int i = 1; i<=10; i++) {
		for(int j =1; j<=10; j++) {
			System.out.println(i + " x " + j + " ");
		}
		System.out.println(" ");
	}
	*/
	
	
	
	}
}
