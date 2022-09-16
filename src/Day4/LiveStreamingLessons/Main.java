package Day1.LiveStreamingLessons.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";
        System.out.println(ortaMetin);
        int vade = 36;
        double dolarDun = 18.19;
        double dolarBugun = 18.19;
        boolean dolarDustuMu = true;
        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "Up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
        String [] krediler= {"Hızlı kredi","Maaşinı halkbaktan","Mutlu Kredi"};
        for (int i = 0; i < krediler.length ; i++) {
            System.out.println(krediler[i]);
        }
    }
}
