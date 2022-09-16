package Day1.Homeworks;

public class TenExercisesFindLetters {

    public static void main(String[] args) {
        char harf='E';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf+" Kalın sesli harftir");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(harf+" İnce sesli harftir");
                break;
            default:
                System.out.println("Normal sesli harfler");}
    }
}