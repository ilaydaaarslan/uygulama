package Giris;

import java.util.Scanner;

public class Proje21 {
    public static void main(String[] args) {

        // TEK SAYI GİRİLENE KADAR GİRİLEN SAYILARINDAN 4'ÜN KATI OLANLARI TOPLAYAN PROGRAM

        int n;
        int total=0;
        Scanner inp =new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n= inp.nextInt();
            if ( n % 4 ==0){
                total += n;
            }
        }while (n % 2 == 0);

        System.out.println("Toplam: " + total);
    }

}

