public class Main {
    public static void main (String[] args){
        System.out.println(hasEqualSum(1, -1, 0));
    }


    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber + secondNumber == thirdNumber){
            return true;
        }else{
            return false;
        }
    }
}
