package Day1.Exercises;

public class ExercisesString {
    public static void main(String[] args) {
        // Su terazisi
        int yatayX = 1, yatayY = 2, dikeyX = 2, dikeyY = 2;

        if (yatayX < yatayY) {
            System.out.println("Yatay Düzlemde Soldan yukarı kaldır");
        }
        if (yatayX > yatayY) {
            System.out.println("Yatay Düzlemde Soldan aşağı İndir");
        }
        if (yatayX == yatayY) {
            System.out.println("Terazi yatay düzlemde eşit");
        }

        if (dikeyX < dikeyY) {
            System.out.println("Dikeyde Saat yönüne doğru çevir");
        }

        if (dikeyX > dikeyY) {
            System.out.println("Dikeyde Saat yönünün tersine doğru çevir");
        }
  if (dikeyX == dikeyY) {
            System.out.println("Terazi dikey düzlemde eşit");
        }
   if (dikeyX == dikeyY || dikeyX == dikeyY) {
            System.out.println("Terazi yatay ve dikey düzlemde eşit eşitlik saülandı");
        }
    }
}
