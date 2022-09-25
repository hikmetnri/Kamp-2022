package Day2.Homeworks.Interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository{

    @Override
    public void ekle() {
        System.out.println("Oracle Eklendi");
    }
}
