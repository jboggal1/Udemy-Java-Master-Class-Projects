public class WhileLoopChallenge {
    public static void main(String[] args) {
        int i = 5, countEven = 0, countOdd = 0;
        while (i <= 20 && countEven < 5) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                countEven++;
            } else {
                countOdd++;
            }
            i++;
        }
        System.out.println("Total number of even numbers = " + countEven + " and odd numbers = " + countOdd);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0) ? true : false;
    }
}
