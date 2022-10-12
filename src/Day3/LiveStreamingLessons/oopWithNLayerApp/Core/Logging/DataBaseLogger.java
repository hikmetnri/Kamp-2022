package Day3.LiveStreamingLessons.oopWithNLayerApp.Core.Logging;

public class DataBaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Databaseye Loglandı: "+data);
    }
}
