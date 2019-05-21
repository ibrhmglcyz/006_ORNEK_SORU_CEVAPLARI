package com.vektorel;

import java.util.Scanner;

public class RunnerOdev {

	public static void main(String[] args) {
				
				// Kullanicidan 3 sayi alacaksiniz
				// a=45, b=98, c=4
				// bu sayilardan buyuk olanini bulan
				// kodu yaziniz.
				
				int a=45,b=98,c=4;
				if(a>b && a>c)
					System.out.println("En Buyuk Sayi..: "+a);
				else if(b>a && b>c)
					System.out.println("En Buyuk Sayi..: "+b);
				else
					System.out.println("En Buyuk Sayi..: "+c);
				
				// Girilen sayiya gore asagidaki sekli 
				// cizen kodu yaziniz
				// > Ornegin, 5 icin 
				// * * * * *
				// *	   *
				// *       *
				// *       *
				// * * * * *
				
				Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.println("Bir Sayi Giriniz...: ");
				int adet = sc.nextInt(); 
				
				for(int j=0; j<adet; j++) {
					
				for(int i=0; i<adet; i++) {
							
					if(i==0 || i==adet-1 || j==0 || j==adet-1)
								System.out.print("* ");
							else
								System.out.print("  ");
							}
				System.out.println();
				}

	}

}
