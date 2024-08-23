package Giris;

import java.util.Scanner;

public class Proje16 {
    public static void main(String[] args) {

        // BURÇ BULAN PROGRAM

        int month, day;
        String burc="";

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = inp.nextInt();
        if (((0 < day) && day <= 31) && ((0 < month) && month <= 12)) {

            if (month == 1) {
                if (21 < day) {
                    burc = "Kova";
                } else {
                    burc = "Oğlak";
                }

            } else if (month == 2) {
                if ((19 < day) && day < 30) {
                    burc = "Balık";
                } else {
                    burc = "Kova";
                }

            } else if (month == 3) {
                if (20 <  day) {
                    burc = "Koç";
                } else {
                    burc = "Balık";
                }

            } else if (month == 4) {
                if ((20 < day) && day < 31) {
                    burc = "Boğa";
                } else {
                    burc = "Koç";
                }

            } else if (month==5) {
                if (21 < day){
                    burc = "İkizler";
                }else {
                    burc = "Boğa";
                }

            } else if (month==6) {
                if ((22 < day) && day < 31){
                    burc = "Yengeç";
                }else {
                    burc = "İkizler";
                }

            } else if (month==7) {
                if (22 < day){
                    burc = "Aslan";
                }else {
                    burc = "Yengeç";
                }

            } else if (month==8) {
                if ((22 < day) && day < 31){
                    burc = "Başak";
                }else {
                    burc = "Aslan";
                }

            } else if (month==9) {
                if (22 < day){
                    burc = "Terazi";
                }else {
                    burc = "Başak";
                }

            } else if (month==10) {
                if ((22 < day) && day < 31){
                    burc = "Akrep";
                }else {
                    burc = "Terazi";
                }

            } else if (month==11) {
                if (21 < day){
                    burc = "Yay";
                }else {
                    burc = "Akrep";
                }

            } else if (month==12) {
                if ((21 < day) && day < 31){
                    burc = "Oğlak";
                }else {
                    burc = "Yay";
                }

            }

            System.out.println("Burcunuz " + burc);

        }else {
            System.out.println("Girilen tarih geçersizdir.");
        }
    }
}