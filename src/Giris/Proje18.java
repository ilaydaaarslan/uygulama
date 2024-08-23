package Giris;

import java.util.Scanner;

public class Proje18 {
    public static void main(String[] args) {

        //ÇİN ZODYAĞI

        int tarih,sonuc;
        String burc= "";

        System.out.print("Doğum Yılınızı Giriniz: ");
        Scanner inp= new Scanner(System.in);
        tarih=inp.nextInt();

        sonuc=tarih % 12;

        if (sonuc==0){
            burc = "Maymun";

        } else if (sonuc==1) {
            burc = "Horoz";

        } else if (sonuc==2) {
            burc = "Köpek";

        } else if (sonuc==3) {
            burc = "Domuz";

        } else if (sonuc==4) {
            burc = "Fare";

        } else if (sonuc==5) {
            burc = "Öküz";

        } else if (sonuc==6) {
            burc = "Kaplan";

        } else if (sonuc==7) {
            burc = "Tavşan";

        } else if (sonuc==8) {
            burc = "Ejderha";

        } else if (sonuc==9) {
            burc = "Yılan";

        } else if (sonuc==10) {
            burc = "At";

        } else if (sonuc==11) {
            burc = "Koyun";

        }
        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
