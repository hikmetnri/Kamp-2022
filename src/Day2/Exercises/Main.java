package Day2.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<>();

        menuGoster();
        String islem=scanner.nextLine();

        if (!(islem.equals("1") || islem.equals("2") || islem.equals("3") || islem.equals("4")))
            return;

        while (true) {
            System.out.print("Sayı giriniz: ");
            String girilenD = scanner.nextLine();
            if (girilenD.equals("q") || girilenD.equals("Q")) {
                break;
            }
            double sayi = Double.parseDouble(girilenD);
            arrayList.add(sayi);

        }
double sonuc=0.0;
        switch (islem) {
            case "1" -> sonuc=DortIslemA.add(arrayList);
            case "2" -> sonuc=DortIslemA.cikar(arrayList);
            case "3" -> sonuc=DortIslemA.carp(arrayList);
            default ->  sonuc=DortIslemA.bolme(arrayList);
        }
        System.out.printf("Sonuç: "+"%.1f",sonuc);
    }
    public static void menuGoster() {
        System.out.println("Yapmak istediğiniz işlemi seçin");
        System.out.println("1:Toplama");
        System.out.println("2:Çıkarma");
        System.out.println("3:Carpma");
        System.out.println("4:Bölme");
    }
}