package Day2.Homeworks.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.dateBaseManager = new OracaleDatabaseManager();

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.dateBaseManager = new SqlDataBaseManager();

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.dateBaseManager = new MySqlDataBaseManager();

        customerManager.getCustomer();
        customerManager1.getCustomer();
        customerManager2.getCustomer();
    }
}
