public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || j == 1 || i == number || j == number) {
                        System.out.print("*");
                    } else if (i == j) {
                        System.out.print("*");
                    } else if (j == (number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("Invalid Value");
        }
    }

}
