package Day3.LiveStreamingLessons.oopWithNLayerApp;

import Day3.LiveStreamingLessons.oopWithNLayerApp.Core.Logging.DataBaseLogger;
import Day3.LiveStreamingLessons.oopWithNLayerApp.Core.Logging.EMailLogger;
import Day3.LiveStreamingLessons.oopWithNLayerApp.Core.Logging.FileLogger;
import Day3.LiveStreamingLessons.oopWithNLayerApp.Core.Logging.Logger;
import Day3.LiveStreamingLessons.oopWithNLayerApp.buisness.ProductManager;
import Day3.LiveStreamingLessons.oopWithNLayerApp.dataAccess.HibernateProductDao;
import Day3.LiveStreamingLessons.oopWithNLayerApp.dataAccess.JdbcProductDao;
import Day3.LiveStreamingLessons.oopWithNLayerApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1=new Product(1,"İphone xr",100);

        Logger [] loggers={};

        ProductManager productManager=new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}
