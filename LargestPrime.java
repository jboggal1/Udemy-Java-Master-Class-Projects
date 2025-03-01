public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        if (number <= 1) {
            return -1;
        }
        int factor = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                factor = i;
                number /= i;
            }
            System.out.println(number);
            if (number > 1) {
                factor = number;
            }
        }
        return factor;
    }
}
