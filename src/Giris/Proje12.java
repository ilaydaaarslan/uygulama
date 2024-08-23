package Giris;

import java.util.Scanner;

public class Proje12 {
    public static void main(String[] args) {

        String userName, password,yeniSifre;
        int select;

        Scanner inp= new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName=inp.nextLine();

        System.out.print("Şifreniz: ");
        password=inp.nextLine();

        if (userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş yaptınız!");

        }else {
            System.out.println("Bilgileriniz yanlış!");

        }
            System.out.println("Şifrenizi yenilemek istiyorsanız 1'i tuşlayınız.");
            select=inp.nextInt();
            inp.nextLine();

            switch (select) {
                case 1:
                System.out.println("Yeni şifrenizi giriniz: ");
                yeniSifre = inp.nextLine();

                if (yeniSifre.equals("java123")) {
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz.");
                }else{
                    System.out.println("Yeni şifreniz başarıyla oluşturuldu!");
                }
                break;

            default:
                    System.out.println("Şifre oluşturulmadı.");

        }
    }
}
// https://github.com/ilaydaaarslan/patika.git
// https://github.com/ilaydaaarslan/patika.git