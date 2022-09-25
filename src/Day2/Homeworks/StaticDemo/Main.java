package Day2.Homeworks.StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager  productManager=new ProductManager();
        Product product= new Product();
        product.id=1;
        product.name="Mauseee";
        product.price=1500;
        productManager.add(product);

        DataBaseHelper.Crud.connetcion();
        DataBaseHelper.Crud.delete();
    }

}
