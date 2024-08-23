package Giris;

import java.util.Scanner;

public class Proje14 {
    public static void main(String[] args) {

        //HAVA SICAKLIĞINA GÖRE ETKİNLİK ÖNERME

        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        heat=inp.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat>=10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
