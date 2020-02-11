public class Main {

    public static void main (String [] arg){
        int value = 3;
        if(value == 1){
            System.out.println("Value was 1");
        }else if (value == 2 ){
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }


        int switchValue = 6;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case  2:
                System.out.println("Value was 2");
                break;

            case 3: case 4 : case 5:
                System.out.println("was a 3, or  a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("was not 1, 2, 3, 4 or 5");
                break;
        }

        char charValue = 'G';
        switch(charValue){
            case 'A':
                System.out.println("was A");
                break;
            case 'B':
                System.out.println("was B");
                break;
            case 'C':
                System.out.println("was C");
                break;
            case 'D':
                System.out.println("was D");
                break;
            case 'E':
                System.out.println("was E");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "JuNE";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }


    }


}
