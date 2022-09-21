package Day2.LiveStreamingLessons;

public class Main {
    public static void main(String[] args) {
        // Set value

        Product product1 = new Product();
        product1.setName("Delogni kahve");
        product1.setDiscount(7);
        product1.setUnitsInStock(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("Url1");

        Product product2 = new Product();
        product2.setName("arzum kahve");
        product2.setDiscount(7);
        product2.setUnitsInStock(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("Url2");

        Product product3 = new Product();
        product3.setName("simens kahve");
        product3.setDiscount(7);
        product3.setUnitsInStock(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("Url3");

        Product[] Products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product products : Products) {
            System.out.println("<li>" + products.getName()+"</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("5055545484");
        individualCustomer.setCustomerNumber("123456");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0533333");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer [] customers={corporateCustomer, individualCustomer};

        for (Customer Customers: customers) {
            System.out.println(customers);
        }

    }
}
