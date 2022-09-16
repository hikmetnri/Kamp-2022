package Day1.Homeworks;

public class NigthExercisesStrings {
    public static void main(String[] args) {
        String message = "   BuGün hava çok güzEEl  ";
        System.out.println(message);
        System.out.println("Eleman sayısı: " + message.length());
        System.out.println("5.Eleman:" + message.charAt(6)); // Karakter sayısını gösterir
        System.out.println(message.concat("Yarında güzel olsa keşke")); // Stringleri birleştirir.
        System.out.println(message.startsWith("B")); // Başlangıçtaki harfi kontrol eder.
        System.out.println(message.endsWith("l")); // Sonundaki harfi kontrol eder
        System.out.println(message.indexOf("bu")); // İlk harfi arar
        System.out.println(message.lastIndexOf("l")); // aramaya sağdan başlar

        // İkinci Bölüm
        String newMassega = message.replace(' ', '-'); // Karakter değiştirici
        System.out.println(newMassega);
        System.out.println(message.substring(2)); // Belirttiğimiz indexe kadar kes.
        System.out.println(message.substring(2, 5)); //sadece aradaki değeri alır.
        //  for (String kelime : message.split(" ")) { // kelimeleri boşluğa göre ayırır tek tek yazdırır.
        //  System.out.println(kelime);
        System.out.println(message.toLowerCase()); // Tüm harfleri küçük yapar.
        System.out.println(message.toUpperCase()); // Tüm harfleri büyük yapar.
        System.out.println(message.trim()); // Kelimenin başındaki ve sonundaki boşlukları alır.
    }
}


