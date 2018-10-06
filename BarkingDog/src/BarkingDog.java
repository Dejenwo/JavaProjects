public class BarkingDog {

    public static void main(String[] args) {

        bark(true,1);
        bark(false,2);
        bark(true,8);
        bark(true,-1);

    }

    public static boolean bark(boolean barking,int hourofday){

        if ((barking) &&
            (hourofday < 8 &&
             hourofday >= 0
             | hourofday >= 23 &&
                        hourofday <= 24 ))
        {
            return true;

        } else if (hourofday >= 8){

            return false;
        }

        return false;

    }

}
