package Day1.Homeworks;

public class FindNumberExercises {
    public static void main(String[] args) {
        int sayilar[] = new int[]{1, 2, 3, 4, 5};
        int aranacak = 4;
        boolean varmi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            System.out.println("Aranan sayı vardır");
        } else {
            System.out.println("Aranan sayı bulunamadı");
        }
    }
}
