package Day2.Homeworks.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        AskerKredi askerKredi=new AskerKredi();
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(tarimKrediManager);
        krediUI.krediHesapla(ogretmenKrediManager);
        krediUI.krediHesapla(askerKredi);

        krediUI.faizHesapla(ogretmenKrediManager);

    }
}
