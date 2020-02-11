public class Main {
    public static void main (String[] args){

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }
    public static void printEqual (int first, int second, int third){
        if(first < 0 || second < 0 || third < 0){
            System.out.println("Invalid value");
        }else if (first == second && first == third && third == second){
            System.out.println("All number are equal");
        }else if (first !=second && second != third && first != third){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }


    }

}
