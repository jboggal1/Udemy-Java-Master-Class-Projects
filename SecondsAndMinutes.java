public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println("Duration = " + getDurationString(3945));
        System.out.println("Duration = " + getDurationString(65, 45));

        System.out.println(getDurationString(-600));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(-60, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds %= 60;
            return getDurationString(minutes, seconds);
        }
        return "Invalid data for seconds(" + seconds + "), must be a positive integer value.";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value.";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59.";
        }
        int hours = minutes / 60;
        minutes %= 60;
        String result = hours + "h " + minutes + "m " + seconds + "s";
        return result;
    }
}
