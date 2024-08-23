package Giris;

import java.util.Scanner;

public class Proje20 {
    public static void main(String[] args) {

       //GİRİLEN SAYIYA KADAR OLAN ÇİFT SAYILARI EKRANA YAZDIRAN PROGRAM

        int sum=0;
        int sayac=0;

        Scanner inp=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int k= inp.nextInt();

        for (int i=1; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                sum+=i;
                sayac++;
            }
        }
        double ort = sum/sayac;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ort);
    }
}
