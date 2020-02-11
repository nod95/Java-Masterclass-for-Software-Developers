public class Main {

    public static void main(String[] args) {

       long miles = SpeedConverter.toMilerPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
