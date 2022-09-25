package Day2.Homeworks.Interfaces;

public class CustomerManager {
  private  ICustomerDal iCustomerDal;
    public CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal=iCustomerDal;
    }

    public void add() {
// İş kodları yazılır.
        iCustomerDal.ekle();
    }
}
