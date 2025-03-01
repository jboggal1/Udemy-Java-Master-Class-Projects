public class Switch {
    public static void main(String[] args) {
        int value = 1;
        /*
         * if (value == 1) {
         * System.out.println("Value is 1.");
         * } else if (value == 2) {
         * System.out.println("Value is 2.");
         * } else {
         * System.out.println("Value is not 1 or 2.");
         * }
         */

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1.");
                break;
            case 2:
                System.out.println("Value is 2.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is either a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value is not 1, 2, 3, 4, or 5");
                break;
        }

        // Enhanced Switch
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1.");
            case 2 -> System.out.println("Value is 2.");
            case 3, 4, 5 -> {
                System.out.println("Value is either a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Value is not 1, 2, 3, 4, or 5");
        }

        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

        System.out.println(month + " is in the " + enhancedGetQuarter(month) + " quarter.");
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return "Invalid Value";
    }

    public static String enhancedGetQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                yield "4th";
            }
            default -> {
                String badResponse = month + " is an invalid value.";
                yield badResponse;
            }
        };
    }
}
