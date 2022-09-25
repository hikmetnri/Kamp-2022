package Day2.Homeworks;

public class Main {
    public static void main(String[] args) {
      /*  String message = "Bugun hava güzel";
        String newMessage = message.substring(2,5);
        System.out.println(newMessage);

        int toplamlar = Methods2.topla(5,8,7);
        System.out.println(toplamlar);

        System.out.println(Methods2.topla2(5,5));
        */
        //      Methods2.add();
        //      Methods1.sayiBulmaca();

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();

        customerManager = customerManager1;
        customerManager.eklendi();
        customerManager.silindi();
        customerManager.guncellendi();

// value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);


        int sayilar1[] ={1, 2, 3};
        int sayilar2[] ={4, 5, 6};
        sayilar2=sayilar1;
        sayilar1[0]=100;
        System.out.println(sayilar2[0]);
    }

}