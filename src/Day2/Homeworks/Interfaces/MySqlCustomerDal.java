package Day2.Homeworks.Interfaces;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void ekle() {
        System.out.println("My sql eklendi");
    }
}
