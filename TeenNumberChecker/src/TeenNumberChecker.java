public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(9,99,19);
        hasTeen(23,15,42);
        hasTeen(22,23,34);



    }

    public static boolean hasTeen(int x, int y , int z) {


     if ((x >= 13 && x <= 19 ) ||
        (y >= 13 && y <= 19) ||
        (z >= 13 && z <= 19)) {

         return true;
        } else {

         return false;
     }
    }
}
