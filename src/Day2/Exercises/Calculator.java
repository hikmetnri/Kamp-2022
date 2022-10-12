package Day2.Exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("İŞlem yapmak için Sayı giriniz");

        System.out.println("Yapmak istediğiniz işlemi seçin");
        System.out.print("1:Toplama "+"2:Çıkarma "+"3:Çarpma "+"4:Bölme ");
        int islem=input.nextInt();

        switch (islem) {
            case 1:
                Calculator topla=new Calculator();
                int toplam= topla.topla();
                System.out.println(toplam);
                break;
            case 2:
                Calculator cikar=new Calculator();
                cikar.cikar();
                break;
            case 3:
                Calculator carp=new Calculator();
                carp.carp();
                break;
            case 4:
                Calculator bol=new Calculator();
                bol.bol();
                break;
        }
    }

    public int topla(int ...sayilar){
        int result=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            result +=sayilar[i];
        }
        return  result;
    }
    public int cikar(int ...sayilar){
        int result=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            result -=sayilar[i];
        }
        return  result;
    }
    public int carp(int ...sayilar){
        int result=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            result *=sayilar[i];
        }
        return  result;
    }
    public int bol(int ...sayilar){
        int result=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            result /=sayilar[i];
        }
        return  result;
    }
}
