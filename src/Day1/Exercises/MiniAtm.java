package Day1.Exercises;

import java.util.Scanner;

public class MiniAtm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kartNo = 11111;
        int sifre = 123;
        int bakiye = 100;
        System.out.println("Kart numaranızı girin");
        int userKart = input.nextInt();
        System.out.println("Sifrenizi girin");
        int userSifre = input.nextInt();

            if (kartNo == userKart) {
                System.out.println("Kart Numarası doğru lütfen şifreyi girininiz");
                if (userSifre == sifre) {
                    System.out.println("Giriş başarılı Yapmak istediğiniz İşlemi seçiniz");

                } else if (userSifre != sifre) {
                    System.out.println("Şifre yanlış tekrar giriş yapınız.");
                }
            }

            if (kartNo != userKart) {
                System.out.println("Kart numarasını yanlış girdiniz.");
            }
            System.out.println("1:Bakiye sorgulama, 2:Bakiye ekleme ,3:Bakiye silme,4:cıkıs");
            int islem = 0;
            switch (islem) {
                case 1:
                    System.out.println(bakiye);
                    break;
                case 2:
                    bakiye += bakiye;
                    break;
                case 3:
                    bakiye -= bakiye;
                    break;
                case 4:

            }
        }
    }


