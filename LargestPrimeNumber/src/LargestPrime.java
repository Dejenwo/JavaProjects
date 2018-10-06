public class LargestPrime {

    public static void main(String[] args) {

        getLargestPrime(21);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(45);
        getLargestPrime(-1);

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                number = i;
            }
        }

        return number;
    }

}
