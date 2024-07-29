package Giris;

     //Vücut Kitle İndeksi Hesaplama

import java.util.Scanner;

public class Proje8 {
    public static void main(String[] args) {

        double boy, kilo;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo= inp.nextDouble();

        double indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);

    }
}
