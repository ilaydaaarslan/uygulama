package Giris;

import java.util.Scanner;

public class Proje17 {
    public static void main(String[] args) {

        //UÇAK BİLETİ

        int mesafe, yas, yolcuTipi;
        double tutar,toplam,yasIndirimi = 0,indirimli;

        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe= inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas=inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolcuTipi=inp.nextInt();

        if ((mesafe > 0) && (yas >= 0)){

            tutar=mesafe*0.10;

            if (yas<12){
                yasIndirimi=tutar*0.5;

            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi=tutar*0.1;

            } else if (yas > 65) {
                yasIndirimi=tutar*0.3;

            }
            indirimli=tutar-yasIndirimi;

            switch (yolcuTipi){
                case 1:
                    toplam=indirimli;
                    System.out.println("Toplam tutar: " + toplam + " TL");
                    break;
                case 2:
                    toplam = (indirimli - (indirimli * 0.2)) * 2;
                    System.out.println("Toplam tutar: " + toplam + " TL");
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz!");
            }

        }else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
