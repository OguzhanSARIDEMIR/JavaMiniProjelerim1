package Projeler;

import java.util.Scanner;

public  class TrenYolcuSistemi {
    public static void TrenYolcuHesaplama (){
        Scanner y=new Scanner(System.in);
        String [] DurakName={"Kirazli","Bagcilar Meydan","UcYuzlu","Menderes","Esenler","Otogar","Kocatepe","Sagmalcilar","Bayrampasa","Topkapi/Ulubatli","Fatih","Aksaray","YeniKapi"};
        int ToplamYolcuSayisi[]=new int[13];
        int Binenyolcu[]=new int[13];
        int inenYolcu[]=new int[13];
        int yolUcreti=8;
        int DurakYolUcreti=0;
        int Tyolcu=0;
        int Tucret=0;
        for(int i=0;i<13;i++){
            System.out.println(DurakName[i]+" Duragindayiz BinenYolcu Sayisini Giriniz=");
            Binenyolcu[i]=y.nextInt();
            System.out.println(DurakName[i]+" Duragindayiz İnenyolcu Sayisini Giriniz=");
            inenYolcu[i]=y.nextInt();
            ToplamYolcuSayisi[i]=Binenyolcu[i]-inenYolcu[i];
            Tyolcu=ToplamYolcuSayisi[i]+Tyolcu;
            DurakYolUcreti=Binenyolcu[i]*yolUcreti;
            Tucret=DurakYolUcreti+Tucret;
            System.out.println(DurakName[i]+" Duraginda Toplam Yolcu Sayisi="+ Tyolcu );
            System.out.println(DurakName[i]+" Duragında Toplam Nakit Miktari="+ Tucret +" Tl dir");



        }



    }

    }

