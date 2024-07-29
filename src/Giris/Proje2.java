package Giris;

import java.util.Scanner;

     // KDV HESAPLAYAN PROGRAM

public class Proje2 {
    public static void main(String[] args) {

        double tutar;
        Scanner inp =new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        tutar= inp.nextDouble();


        boolean a= 0 < tutar || tutar < 1000;
        double kdvoranı=0.18;


        double kdv;
        kdv=tutar+tutar*18/100;
        System.out.println("KDV'li fiyat: "+ kdv);


        boolean b= tutar>1000;
        kdvoranı=0.8;

        kdv=tutar+tutar*0/100;
        System.out.println("KDV'li fiyat: "+ kdv);



    }
}
