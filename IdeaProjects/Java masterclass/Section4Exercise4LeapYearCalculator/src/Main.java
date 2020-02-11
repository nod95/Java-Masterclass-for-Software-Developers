public class Main {

    public static void main (String[] args) {
        System.out.println(isLapYear(1600));
    }
    public static boolean isLapYear (int year){
        if(year <= 1 || year > 9999){
            System.out.println("Since parameter is not in the range (1-9999)");
            return false;
        }else if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println("Leap year");
            return true;
        }else {
            System.out.println("Not a leap Year");
            return false;
        }
    }
}
