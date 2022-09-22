package Day2.Homeworks;

public class Methods2 {

    public static void add(){
        System.out.println("Eklendi");
    }
    public static void delete(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }
    
    public static int topla(int a1,int a2, int a3){
        int topla = a1+a2+a3;
        return topla;
    }

    public static int topla2(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
}
