public class Main {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPLaces(-3.1034, (int) -3.1035));
    }
    public static boolean areEqualByThreeDecimalPLaces (double firstNumber, int secondNumber){
        if((int) (firstNumber * 1000) == (int) (secondNumber * 1000)){
            return true;
        }else{
            return false;
        }
    }
}
