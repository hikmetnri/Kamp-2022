package Day2.Homeworks;

public class Main {
    public static void main(String[] args) {
        String message = "Bugun hava güzel";
        String newMessage = message.substring(2, 5);
        System.out.println(newMessage);

        int toplamlar = Methods2.topla(5,8,7);
        System.out.println(toplamlar);

        System.out.println(Methods2.topla2(5,7,8,9,7));
        //      Methods2.add();
        //      Methods1.sayiBulmaca();
    }
}
