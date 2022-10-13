package Day3.Homeworks;

public class YoutubeEgitim {
    public static void main(String[] args) {

        // int  sayilar1 []=new int []{1,2,3};
        //int  [] sayilar2=new int [] {10,20,30};
        //sayilar1=sayilar2;
        // sayilar2[0]=40;

        //System.out.println(sayilar1[0]);

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Mersin");

        Company company = new Company();
        company.setTaxNumber(1);
        company.setCompanyName("arçelik");
        company.setId(100);

        Person person =new Person();
        person.setFirstname("Hikmet");
        person.setLastname("Nuri");

          CustomerManager customers =new CustomerManager(customer,company,person);
          customers.add(customer);
          customers.save(customer);

    }
}
