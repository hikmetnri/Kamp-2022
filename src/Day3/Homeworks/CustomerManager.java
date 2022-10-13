package Day3.Homeworks;

public class CustomerManager {
    private Customer customer;
    private Company company;
    private Person person;

    public CustomerManager(Customer customer, Company company, Person person) {
        this.customer = customer;
        this.company = company;
        this.person = person;
    }


    public void save(Customer customer) {
        System.out.println("Müşteri kaydedildi: "+person.getFirstname());
    }

    public void add(Customer customer) {
        System.out.println("Müşteri eklendi: "+person.getFirstname());
    }
}
