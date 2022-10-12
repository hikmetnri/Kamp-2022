package Day3.LiveStreamingLessons.oopWithNLayerApp.Core.Logging;

public class EMailLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Maille Loglandı: "+data);
    }
}
