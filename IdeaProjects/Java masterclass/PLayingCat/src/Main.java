public class Main {
    public static void main (String[] args){
       System.out.println( isCatPlaying(true, 10));
        System.out.println( isCatPlaying(false, 36));
        System.out.println( isCatPlaying(false, 35));


    }
    public static boolean isCatPlaying (boolean summer, int temperature){
        if(summer == true && temperature >= 25 && temperature <= 35){
            return true;
        }else if (summer == true && temperature < 25 || temperature > 35){
            return false;
        }else if (summer == false && temperature >= 25 && temperature <= 35){
            return true;
        }
        else if (summer == false && temperature < 25 || temperature > 35){

        }else{
            return false;
        }
            return summer;
    }
}
