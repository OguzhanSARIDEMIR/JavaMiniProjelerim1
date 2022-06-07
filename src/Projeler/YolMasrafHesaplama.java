package Projeler;

import java.util.Scanner;

public class YolMasrafHesaplama {
    public static void yolcuMasrafi() {
        double Yolmasrafiniz=0;
        double YiyecekMasrafiniz=0;
        double GenelMasraf=0;
        System.out.println("Kac Kilometre [km] Yol Gidiceksiniz Giriniz!!");
        Scanner km=new Scanner(System.in);
        double a=km.nextDouble();
        System.out.println("Saatte Km Hızla Gidiyorsunuz ... ");
        double b=km.nextDouble();
        if (a>=1 && a<=300 && b>=1 && b<=100){

            Yolmasrafiniz=a*1.5;
            YiyecekMasrafiniz=50;
            GenelMasraf=YiyecekMasrafiniz+Yolmasrafiniz;


        } else if (a>=1 && a<=300 && b>100 ) {
            Yolmasrafiniz=a*2;
            YiyecekMasrafiniz=50;
            GenelMasraf=YiyecekMasrafiniz+Yolmasrafiniz;

        } else if (a>300 && b>=1 && b<=100) {
            Yolmasrafiniz=a*1.5;
            YiyecekMasrafiniz=100;
            GenelMasraf=YiyecekMasrafiniz+Yolmasrafiniz;

        }else {
            Yolmasrafiniz=a*2;
            YiyecekMasrafiniz=100;
            GenelMasraf=YiyecekMasrafiniz+Yolmasrafiniz;
        }

        System.out.println("Yol Masraf="+Yolmasrafiniz);
        System.out.println("Yıyecek Masraf="+YiyecekMasrafiniz);
        System.out.println("Genel Masraf="+GenelMasraf);


    }
}
