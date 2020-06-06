package exercises;

import java.math.BigInteger;

public class Power {

    public static void main(String[] args) {

        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger sum = one.add(two);
        BigInteger diffrence = one.subtract(two);
        BigInteger product = one.multiply(two);
        BigInteger divide = one.divide(two);

    }

    static int power(int n) {
        int accumulator = 1;


        for (int i = 1; i <= n; i++) {
            accumulator *= 1;


        }
        return accumulator;

    }

    static BigInteger bigInteger(BigInteger n) {
        int nAsInt = n.intValue();
        for (int i = 0; i < nAsInt; i++) ;


        return null;

    }
}
