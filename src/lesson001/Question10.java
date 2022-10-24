package lesson001;

import java.util.Scanner;

public class Question10 {
public static void main(String[] args) {
	
	// Girilen ortalamanın harf notuna göre geçip geçmediğini bulan program
	
	// 90 üstü AA
	// 80 ve 90 arası BB
	// 70 le 80 arası CC
	// 60 la 70 arası DD
	// 60 tan küçükse FF kaldı olsun
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("not ortalaması giriniz: ");
	int not = scanner.nextInt();
	
	if(not >=90) {
		System.out.println("AA ile geçtiniz -->" + not);
	}else if(not>=80 && not<90) {
		System.out.println("BB ile geçtiniz--> " + not);
	}else if(not>=70 && not<80) {
		System.out.println("CC ile geçtiniz--> " + not);
	}else if(not>=60 && not<70) {
		System.out.println("DD ile geçtiniz--> " + not);
	}else {
		System.out.println("Dersten FF ile kaldınız "+ not);
	}
	
}
}
