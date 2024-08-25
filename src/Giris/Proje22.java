package Giris;

import java.util.Scanner;

public class Proje22 {
    public static void main(String[] args) {

        //GİRİLEN SAYIYA KADAR 4 VE 5'İN KUVVETLERİNİ YAZDIRAN PROGRAM

        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n=scan.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        for (int i=1; i <= n; i*=4){
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("5'in kuvvetleri: ");
        for (int i=1; i <= n; i*=5) {
            System.out.print(i + ", ");
        }
    }
}
