package Day2.Homeworks;

public class Methods1 {
    public static void sayiBulmaca() {
        int sayilar[] = new int[]{1, 2, 3, 4, 5};
        int aranacak = 6;
        boolean varmi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            sendaMessage("Sayı mevcuttur:  " + aranacak);
        } else {
            sendaMessage("Sayı mevcuttur değildir:  " + aranacak);
        }
    }

    public static void sendaMessage(String message) {
        System.out.println(message);
    }
}
