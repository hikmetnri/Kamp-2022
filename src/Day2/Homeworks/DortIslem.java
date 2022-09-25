package Day2.Homeworks;

public class DortIslem {
    public static void main(String[] args) {

        System.out.println(topla(3,4));
        System.out.println(cikar(10,5));
        System.out.println(carp(5,5));
        System.out.println(bol(8,2));
    }
    public static  int topla(int sayi1,int sayi2){
        int result = 0;
        result = sayi1+sayi2;
        return result;
    }
    public static  int cikar(int sayi1,int sayi2){
        int result = 0;
        result = sayi1-sayi2;
        return result;
    }
    public static  int carp(int sayi1,int sayi2){
        int result = 0;
        result = sayi1*sayi2;
        return result;
    }
    public static  int bol(int sayi1,int sayi2){
        int result = 0;
        result = sayi1/sayi2;
        return result;
    }
}
