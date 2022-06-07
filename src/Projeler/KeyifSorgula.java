package Projeler;

import java.util.Scanner;

public class KeyifSorgula {
    public static void k() {
        System.out.println("Kanka Sana Is Lazim");

    }
    public static void Keyfs() {
        System.out.println("Bugün Keyfiniz Nasıl");
        System.out.println("1:IYI");
        System.out.println("2:Normal");
        System.out.println("3:Anormal");
        System.out.println("4:idare eder");
        System.out.println("5:Bana Dokanmayin");

        System.out.println("Lütfen Sadece Menüden Seçiniz...");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();


        if (a==1){
            System.out.println("Iyı O zaman :)" );


        } else if (a==2) {
            System.out.println("Bizimde Oyle");

        } else if (a==3) {
            System.out.println("Takma Bosver");
        } else if (a==4) {
            System.out.println("Hangi Idare :( ");

        }else{
            k();

        }

    }
}
