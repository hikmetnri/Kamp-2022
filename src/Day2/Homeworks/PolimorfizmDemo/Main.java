package Day2.Homeworks.PolimorfizmDemo;

public class Main {
    public static void main(String[] args) {
     /*   BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers) {
            logger.Log("Log mesajı");
        }
        */
        CustomerManager customerManager = new CustomerManager(new DataBaseLogger(), new FileLogger(), new DataBaseLogger(), new EmailLogger());
      // customerManager.ekle();
       // customerManager.sil();
        customerManager.update();

    }

}
