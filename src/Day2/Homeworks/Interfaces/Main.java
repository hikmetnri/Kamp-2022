package Day2.Homeworks.Interfaces;

public class Main {
    public static void main(String[] args) {
        ICustomerDal iCustomerDal = new OracleCustomerDal();
        //   iCustomerDal.ekle();
        ICustomerDal iCustomerDal1 = new MySqlCustomerDal();
        //   iCustomerDal1.ekle();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        CustomerManager customerManager1=new CustomerManager(new OracleCustomerDal());

        customerManager.add();
       customerManager1.add();
    }
}
