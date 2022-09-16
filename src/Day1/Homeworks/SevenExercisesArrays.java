package Day1.Homeworks;

public class SevenExercisesArrays {
    public static void main(String[] args) {
        String[] ogrenciler = new String[5];
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "ahmet";
        ogrenciler[2] = "veri";
        ogrenciler[3] = "cenk";
        ogrenciler[4] = "yeliz";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        //Diğer kullanım
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        double[] myList = {321.2, 63.3, 5.4, 5.78, 408.4};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number){
                max=number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        System.out.println("En büyük sayı: "+max);
    }
}
