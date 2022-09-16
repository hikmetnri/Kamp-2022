package Day1.Homeworks;

public class TreeExercisesConditionRecapt {
    public static void main(String[] args) {
        int sayi=16;
        if (sayi<20){
            System.out.println("Sayi 20 den küçüktür");

        } else if (sayi==20) {
            System.out.println("Sayılar eşittir");
        } else {
            System.out.println("Yirmiden büyüktür");
        }
        // EN BÜYÜK SAYIYI BULMA
        int sayi1=70 ,sayi2=90, sayi3=40 ,enBüyükSayi=sayi1;
        if (enBüyükSayi<sayi2){
            enBüyükSayi= sayi2;
        }
        if (enBüyükSayi<sayi3){
            enBüyükSayi= sayi3;
        }
        System.out.println("En büyük sayı:"+enBüyükSayi);
    }
    }
