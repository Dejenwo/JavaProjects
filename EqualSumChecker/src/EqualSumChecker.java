public class EqualSumChecker {

    public static void main(String[] args) {

        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,1);

    }

    public static boolean hasEqualSum ( int x, int y , int z) {



        if (x+ y == z ) {

            return true;


        } else {

            return false;
        }
    }
}
