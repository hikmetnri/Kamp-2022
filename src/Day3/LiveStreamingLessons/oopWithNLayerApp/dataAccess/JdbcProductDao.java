package Day3.LiveStreamingLessons.oopWithNLayerApp.dataAccess;


import Day3.LiveStreamingLessons.oopWithNLayerApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        // Sadece db erişim kodları yazılır.
        System.out.println("Jdbc ile Veritabanına eklendi");
    }
}
