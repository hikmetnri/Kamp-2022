package Day1.Homeworks;

public class PercectNumberExercises {
    public static void main(String[] args) {
        // Mükemmel SAYI ÖRNEK
        // 6 --> 1,2,3
        // 28 -->1,2,4,8,14
        int number = 18;
        int total = 0;
        for (int i = 1; i < number; i++) { // girilen sayıya kadar git
            if (number % i == 0) { // tam bölümünden kalan sayılar 0 ise bölünen sayıları tut koşuludur
                total = total + i; // tutulan tam   bölünen sayıları topla ve ata
            }
        }
        if (total == number) {    // toplama işlemi girilen sayi ile aynı ise mükemmel sayıdır.
            System.out.println("Mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }
    }
}