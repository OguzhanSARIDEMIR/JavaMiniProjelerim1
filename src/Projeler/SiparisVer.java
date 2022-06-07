package Projeler;

import java.util.Scanner;

public class SiparisVer {
    public static void Siparisim() {
        int c =1;
        int kackisisiniz;
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        kackisisiniz=x;

        double ToplamFiyat=0;
        double cay=5.5; double soda=7.75; double cola=11.25; double su=3; double TurkKahvesi=15; double Nescafe=9.75;
        double cp=40; double mp=45; double fp=50; double ık=25; double b=35; double t=55; double sp=40;
        System.out.println("icecek Menusu");
        System.out.print("cay:"+cay + " soda:"+soda+" cola:"+cola+" su:"+su+" Turk Kahvesi:"+TurkKahvesi+" Nescafe:"+Nescafe);
        System.out.println("Tatlı Menüsü");
        System.out.print("Cikolatali Pasta:"+cp+" Meyveli Pasta:"+mp+" Franboazli Pasta:"+fp+" islak Kek:"+ık+" Baklava:"+b+" Tramisu:"+t+" SekerPare:"+sp);

        System.out.println("Menüden Seciniz Cay=1,Soda=2,cola=3,su=4,Turk Kahvesi=5,Nescafe=6,Cikolatali Pasta=7,Meyveli Pasta=8,Franboazli Pasta=9,Islak Kek=10,Baklava=11,Tramisu=12,SekerPare=13");
        System.out.println("Seciminiz Bittiginde 0'a basınız !!!!!!!");
        while (c != 0){
            int a=scanner.nextInt();
            c=a;
            switch (a){
                case 1: ToplamFiyat=ToplamFiyat+cay;
                break;
                case 2: ToplamFiyat=ToplamFiyat+soda;
                    break;
                case 3: ToplamFiyat=ToplamFiyat+cola;
                    break;
                case 4: ToplamFiyat=ToplamFiyat+su;
                    break;
                case 5: ToplamFiyat=ToplamFiyat+TurkKahvesi;
                    break;
                case 6: ToplamFiyat=ToplamFiyat+Nescafe;
                    break;
                case 7: ToplamFiyat=ToplamFiyat+cp;
                    break;
                case 8: ToplamFiyat=ToplamFiyat+mp;
                    break;
                case 9: ToplamFiyat=ToplamFiyat+fp;
                    break;
                case 10: ToplamFiyat=ToplamFiyat+ık;
                    break;
                case 11: ToplamFiyat=ToplamFiyat+b;
                    break;
                case 12: ToplamFiyat=ToplamFiyat+t;
                    break;
                case 13: ToplamFiyat=ToplamFiyat+sp;
                    break;

                default:{
                    ToplamFiyat=ToplamFiyat;
                }
            }
        }
        System.out.println("KİŞİ BAŞI HESABINIZ:"+ToplamFiyat/kackisisiniz);
        System.out.println("Toplam Fiyat="+ToplamFiyat);
        System.out.println("Bizi Tercih Ettiginiz için Tesekkür ederiz");




    }

}
