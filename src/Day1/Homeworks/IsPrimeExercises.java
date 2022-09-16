package Day1.Homeworks;

public class IsPrimeExercises {
    public static void main(String[] args) {
        int number =2;
        boolean sayiAsalmi = true;
        if (number == 1) {
            System.out.println("En küçük asal sayı 2 dir.");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sayiAsalmi = false;
                System.out.println("asal sayı değildir");
            }
        }
        if (sayiAsalmi) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("sayi asal değildir");
        }
    }
}
