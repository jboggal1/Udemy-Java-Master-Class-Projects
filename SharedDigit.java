public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(12, 21));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        }
        boolean result = false;
        while (x > 10 && y > 10) {

            int firstRight = x % 10;
            int secondRight = y % 10;
            x /= 10;
            y /= 10;
            result = result || (firstRight == secondRight) || (x == secondRight) || (firstRight == y);
        }
        result = result || (x == y);
        return result;
    }
}
