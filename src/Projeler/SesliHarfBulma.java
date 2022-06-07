package Projeler;

public class SesliHarfBulma {
    public static void sesliHarf(){
    {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("Ince Sesli Harf");
        }
    }
}}