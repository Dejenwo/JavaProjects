public class DecimalComparator {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        areEqualByThreeDecimalPlaces(3.175,3.176);
        areEqualByThreeDecimalPlaces(3.0,3.0);

    }


    public static boolean areEqualByThreeDecimalPlaces( double x, double y) {

        x = x * 1000;
        y = y * 1000;

        int x1 = (int)x;
        int y1 = (int)y;

        if (x1 == y1 ){
             return true;

        }else {

            return false;
        }
    }
}
