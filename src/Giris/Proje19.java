package Giris;

import java.util.Scanner;

public class Proje19 {
    public static void main(String[] args) {

        //ARTIK YIL HESAPLAMA

        int yil;

        Scanner inp =new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil=inp.nextInt();


        if (yil%4==0){
            System.out.print(yil + " bir artık yıldır!");
        }else {
            System.out.print(yil + " bir artık yıl değildir!");
        }
    }
}
