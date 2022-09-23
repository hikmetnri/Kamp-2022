package Day2.Exercises;

public class DortIslem2 {
    public static void main(String[] args) {
        System.out.println("Toplam sonucu:" + topla(15, 3,15,7,7));
        System.out.println("Cıkarma sonucu:" + cikar(15, 3, 4));
        System.out.println("Carpma:" + carp(10, 3, 4,2));
        System.out.println("Bölme:" + bol(30, 3, 2,1));
    }

    public static int topla(int... sayilar) {
        int result = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            result += sayilar[i];
        }
        return result;
    }

    public static int carp(int... sayilar) {
        int result = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            result *= sayilar[i];
        }
        return result;
    }

    public static int cikar(int... sayilar) {
        int result = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            result -= sayilar[i];
        }
        return result;
    }

    public static int bol(int... sayilar) {
        int result = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            result /= sayilar[i];
        }
        return result;
    }
}

