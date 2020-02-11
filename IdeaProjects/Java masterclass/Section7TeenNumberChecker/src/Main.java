public class Main {
    public static void main (String[] args){
        System.out.println(hasTeen(22,23,24));
        System.out.println(isTeen(15));
    }
    public static boolean hasTeen (int firstN, int secondN, int thirdN){
        if((firstN >= 13 && firstN <= 19) || (secondN >= 13 && secondN <= 19) || (thirdN >= 13 && thirdN <= 19)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen (int var){
        if(var >= 13 && var <= 19){
            return true;
        }else {
            return false;
        }

    }
}
