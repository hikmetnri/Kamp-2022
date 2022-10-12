package Day2.Exercises;

import java.util.ArrayList;

public class DortIslemA {
    public static double add(ArrayList<Double> arrayList) {
        return arrayList.stream().reduce(0.0, (a, b) -> a + b);
    }

    public static double carp(ArrayList<Double> arrayList) {
        return arrayList.stream().reduce(1.0, (a, b) -> a * b);
    }

    public static double cikar(ArrayList<Double> arrayList) {
     /*   double result = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            result -= arrayList.get(i);
        }
        return result;
        */
        return arrayList.stream().reduce(arrayList.get(0) * 2, (a, b) -> a - b);
    }

    public static double bolme(ArrayList<Double> arrayList) {
       /* double result = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            result /= arrayList.get(i);
        }
        return result; */
        return arrayList.stream().reduce(Math.pow(arrayList.get(0), 2), (a, b) -> a / b);
    }
}
