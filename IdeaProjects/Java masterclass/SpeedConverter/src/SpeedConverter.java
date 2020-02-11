public class SpeedConverter {

    public static long toMilerPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0){
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilerPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h= " + milesPerHour + "mi/h");
        }
    }
}
