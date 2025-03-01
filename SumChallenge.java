public class SumChallenge {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000 && count < 5; i++) {
            if (i % 15 == 0) {
                sum += i;
                count++;
                System.out.println(i + " is divisible by 3 and 5.");
            }
        }
        System.out.println("Total sum is " + sum);
    }
}
