package Day2.Homeworks.ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus",500,5,"sarı","5");
        System.out.println(product);

        ProductManager productManager=new ProductManager();
      productManager.add(product);
    }
}
