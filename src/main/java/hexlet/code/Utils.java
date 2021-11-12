package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int MAX = 100;
    public static final int MIN = -50;

    public static int getRandomNumber(int inclusiveMin, int inclusiveMax) {
        Random random = new Random();
        return  inclusiveMin + random.nextInt(inclusiveMax + 1);
    }

    public static int getRandomNumber(int inclusiveMax) {
        Random random = new Random();
        return random.nextInt(inclusiveMax + 1);
    }

}
