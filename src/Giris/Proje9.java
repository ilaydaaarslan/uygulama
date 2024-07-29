package Giris;

import java.util.Scanner;

       // Manav Kasa Programı

public class Proje9 {
    public static void main(String[] args) {

        double armut, elma,domates,muz, patlıcan;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo? :");
        armut= inp.nextInt();
        armut=(armut*2.14);

        System.out.print("Elma kaç kilo? :");
        elma=inp.nextInt();
        elma=(elma*3.67);

        System.out.print("Domates kaç kilo? :");
        domates= inp.nextInt();
        domates=(domates*1.11);

        System.out.print("Muz kaç kilo? :");
        muz= inp.nextInt();
        muz=(muz*0.95);

        System.out.print("Patlıcan kaç kilo? :");
        patlıcan= inp.nextInt();
        patlıcan=(patlıcan*5.00);


        double toplam=(armut + elma + domates + muz + patlıcan);
        System.out.println("Toplam tutar: "+ toplam  + "TL");

    }
}
