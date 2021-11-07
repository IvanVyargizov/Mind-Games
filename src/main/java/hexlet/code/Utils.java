package hexlet.code;

public class Utils {

    public static final int UPPER_LIMIT = 100;
    public static final int BOTTOM_LIMIT = -50;

    public static int getRandomNumber(int bottomLimit, int upperLimit) {
        return bottomLimit + (int) (Math.random() * upperLimit);
    }

}
