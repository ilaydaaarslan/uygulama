package Giris;

import java.util.Scanner;

        // Dairenin Alanını ve Çevresini Bulan Program

public class Proje5 {
    public static void main(String[] args) {

        double yarıcap;

        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        yarıcap=input.nextInt();

        double alan, çevre;

        alan= yarıcap*yarıcap*3.14;
        System.out.println("Dairenin alanı: "+alan);

        çevre=yarıcap*3.14*2;
        System.out.println("Dairenin çevresi: "+çevre);

    }
}
