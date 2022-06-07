package Projeler;

import java.util.Scanner;

public class Array {
    public static void mein() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayi degerleri giriniz!!");
        int[] ar1 = new int[5];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scanner.nextInt();

        }

        int total = 0;
        for (int i = 0; i < ar1.length; i++) {
            total += ar1[i];
        }
        System.out.println("Ortalama :" + (double) total / ar1.length);
    }


}