package Projeler;

import java.util.Scanner;

public class Atm {
    public static void atm() {

        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        int bakiye=5000;
        int islem;

        System.out.println("1: Bakiye Görüntüle");
        System.out.println("2: Para Yatırma");
        System.out.println("3: Para Cekme");
        System.out.println("4: Islemden Cıkıs");

        islem=scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println("Bakiyeniz"+bakiye+"Tl'dir");
                break;
            case 2:
                System.out.println("Ne Kadar Yatiracaksiniz?");
                int miktar=scanner.nextInt();

                bakiye=bakiye+miktar;
                System.out.println("Bakiyeniz"+bakiye+"Tl ' dir..");
                break;
            case 3:
                System.out.println("Ne Kadar Cekeceksiniz ?");
                miktar=scanner.nextInt();
                if (miktar>5000){
                    System.out.println("Bakiyeniz Yetersiz!!");

                }else{
                    bakiye-=miktar;
                    System.out.println("Kalan Bakiyeniz.");
                }
                System.out.println("Bakiyeniz="+bakiye);


                break;
            default:
                System.out.println("Gecersiz islem..");

        }

    }

}
