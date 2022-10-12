package Day3.LiveStreamingLessons.oopWithNLayerApp.dataAccess;

import Day3.LiveStreamingLessons.oopWithNLayerApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        // Sadece db erişim kodları yazılır.
        System.out.println("Hibernate ile Veritabanına eklendi");
    }
}
