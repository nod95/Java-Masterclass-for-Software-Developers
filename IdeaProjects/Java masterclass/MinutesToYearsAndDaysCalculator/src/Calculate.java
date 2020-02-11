public class Calculate {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid value");
        }

        long years = ((minutes / 60) / 24) / 365;
        long days = ((minutes / 60) / 24) % 365;
        System.out.println(minutes + "min = " + years + "y " + days + "d");

    }
}
