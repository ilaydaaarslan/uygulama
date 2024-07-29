package Giris;

import java.util.Scanner;

    // NOT ORTALAMASINI HESAPLAYAN PROGRAM

public class Proje1 {
    public static void main(String[] args) {

        int mat, tur,fiz,kim,muz;
        Scanner not=new Scanner(System.in);

        // Kullanıcıdan değerleri alıyoruz.
        System.out.print("Matematik notunuz: ");
        mat= not.nextInt();

        System.out.print("Türkçe notunuz: ");
        tur=not.nextInt();

        System.out.print("Fizik notunuz: ");
        fiz=not.nextInt();

        System.out.print("Kimya notunuz: ");
        kim=not.nextInt();

        System.out.print("Müzik notunuz: ");
        muz=not.nextInt();

        int toplam;
        toplam= (mat+tur+fiz+kim+muz)/5;
        System.out.println("Ortalamanız: " + toplam);

        boolean sonuc=toplam<60;
        boolean sonuc2=toplam>60;


        if (toplam>60){
            System.out.println("Sınıfı geçtiniz.");

        }
        else {
            System.out.println("Sınıfta kaldınız.");
        }

    }
}
