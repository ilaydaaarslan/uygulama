package Giris;
// Not ortalaması hesaplayan program

import java.util.Scanner;

public class Proje7 {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp= new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz: ");
        mat= inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik= inp.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya= inp.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce= inp.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih= inp.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik= inp.nextInt();

        int toplam=(mat + fizik + tarih + turkce + muzik + kimya);
        double sonuc=toplam/6.0;
        System.out.println("Ortalamanız: " + sonuc);
    }
}
