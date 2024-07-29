package Giris;

import java.util.Scanner;

        //Dik Üçgende Hipotenüs Bulan Program

public class Proje3 {
    public static void main(String[] args) {

        int karşıkenar, komşukenar;

        System.out.print("Karşı kenarı yazınız: ");
        Scanner karşı = new Scanner(System.in);
        karşıkenar = karşı.nextInt();

        System.out.print("Komşu kenarı yazınız: ");
        Scanner komşu =new Scanner(System.in);
        komşukenar= komşu.nextInt();

        int hipotenüskaresi;
        hipotenüskaresi=((karşıkenar*karşıkenar)+(komşukenar*komşukenar));

        System.out.println("Hipotenüs: "+ Math.sqrt(hipotenüskaresi));


    }
}
