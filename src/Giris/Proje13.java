package Giris;

import java.util.Scanner;

public class Proje13 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner inp =new Scanner(System.in);

        System.out.print("Matemaik notunuz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik=inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce=inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya=inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik=inp.nextInt();

        double avarage = (mat+fizik+kimya+turkce+muzik)/5;
        System.out.println("Ortalamanız: " + avarage);

        if (avarage<=55){
            System.out.println("Sınıfta kadınız. Seneye tekrar görüşmek üzere.");

        }else {
            System.out.println("Tebrikler, sınıfı geçtniz!");
        }

    }
}
