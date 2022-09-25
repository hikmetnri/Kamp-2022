package Day2.Homeworks.PolimorfizmDemo;

public class CustomerManager {
    private BaseLogger logger;
private  FileLogger fileLogger;
private  DataBaseLogger dataBaseLogger;
private  EmailLogger emailLogger;

    public CustomerManager(BaseLogger logger, FileLogger fileLogger,DataBaseLogger dataBaseLogger,EmailLogger emailLogger){
        this.logger=logger;
        this.fileLogger=fileLogger;
        this.dataBaseLogger=dataBaseLogger;
        this.emailLogger=emailLogger;
    }

    public void ekle() {
        this.logger.log("Eklendi");
        this.fileLogger.log("Eklendi");
        this.dataBaseLogger.log("Eklendi");
        this.emailLogger.log("Eklendi");
    }
    public void  sil(){
        this.logger.log("Silindi");
        this.fileLogger.log("Silindi");
        this.dataBaseLogger.log("Silindi");
        this.emailLogger.log("Silindi");
    }
    public void  update(){
        this.logger.log("Güncellendi");
        this.fileLogger.log("Güncellendi");
        this.dataBaseLogger.log("Güncellendi");
        this.emailLogger.log("Güncellendi");
    }

}
