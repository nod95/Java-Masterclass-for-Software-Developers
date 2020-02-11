public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] aargs) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(5000L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + "h";
        if(remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString =seconds + "h";
        if(seconds < 10){
           secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}