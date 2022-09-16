package Day1.Homeworks;

public class SixExercisesWhileLoops {
    public static void main(String[] args) {
        int j = 0;
        while (j <= 30) {
            System.out.println(j);
            j++;
        }
        System.out.println("while döngüsü bitti");

        // DO WHİLE DÖNGÜSÜ

        int b = 5;
        do {
            System.out.println(b);
            b += 2;
        } while (b < 5);
        System.out.println("B 5ten büyük");
        System.out.println("Do while döngüsü bitti");
    }
}
