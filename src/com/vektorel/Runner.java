package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// 1- Kullaniciya 1 ile 4 arasinda
		// sayi girmesi icin zorlayacak
		// 2- 4 islem yapabilecek
		// 3- Secilen isleme gore 2 sayi talep edecek.
		// 4- Tekrar islem yapmak istiyor musunuz?
		// kod yazilacak. (dongu,if,switch kullanilabilir.)
			
				int secim =1;
				String tercih="E";
				double sayi1,sayi2,sonuc=0;
				Scanner sc;
				do {
				sc = new Scanner(System.in);
				
				do {
				System.out.println("****** ISLEMLER ******");
				System.out.println("1- Toplama");
				System.out.println("2- Cikartma");
				System.out.println("3- Carpma");
				System.out.println("4- Bolme");
				System.out.println("Seciniz...: ");
				secim = sc.nextInt();
				}while(secim<1 || secim>4);
				
				System.out.println();
				System.out.println("1. Sayiyi giriniz...: ");
				sayi1 = sc.nextDouble();
				System.out.println("2. Sayiyi giriniz...: ");
				sayi2 = sc.nextDouble();
				
				switch (secim) {
				case 1:sonuc = sayi1+sayi2;		break;
				case 2:sonuc = sayi1-sayi2;		break;
				case 3:sonuc = sayi1*sayi2;		break;
				case 4:sonuc = sayi1/sayi2;		break;
				
				}
				System.out.println("Islemin Sonucu...: "+sonuc);
			
				System.out.println("Devam Edelim mi?(E)");
				sc = new Scanner(System.in);
				tercih = sc.nextLine();
				
				}while(tercih.equals("E"));
				
				System.out.println("PROGRAM SONLANDI");

	}

}
