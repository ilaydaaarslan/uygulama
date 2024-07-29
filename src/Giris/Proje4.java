package Giris;

import java.util.Scanner;

       // Taksimetre Hesaplayan Program

public class Proje4 {
    public static void main(String[] args) {

        int km;

        Scanner input=new Scanner(System.in);
        System.out.print("Kilometreyi giriniz:");
        km=input.nextInt();

        double tutar,fiyat;

        tutar= km*2.20;
        fiyat=10+ tutar;
        if (fiyat<20)
            System.out.println("Ödenecek tutar: 20 tl");

        else
            System.out.println("Ödenecek tutar: " + fiyat + " tl");

    }
}
