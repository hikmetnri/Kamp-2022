package Day3.LiveStreamingLessons.oopWithNLayerApp.buisness;

import Day3.LiveStreamingLessons.oopWithNLayerApp.Core.Logging.Logger;
import Day3.LiveStreamingLessons.oopWithNLayerApp.dataAccess.HibernateProductDao;
import Day3.LiveStreamingLessons.oopWithNLayerApp.dataAccess.JdbcProductDao;
import Day3.LiveStreamingLessons.oopWithNLayerApp.dataAccess.ProductDao;
import Day3.LiveStreamingLessons.oopWithNLayerApp.entities.Product;

import java.util.List;

public class ProductManager {
    private  ProductDao productDao;
    private Logger[] loggers;



    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 18) {
            throw new Exception("hatalı ürün");
        }
        productDao.add(product);

        for (Logger logger:loggers) { //[db, mail]
            logger.log("Ürün: "+product.getName());
        }
    }
}
