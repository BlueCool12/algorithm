import java.math.BigInteger;

class P1271_엄청난_부자_2 {

    public static void shareMoney(BigInteger money, BigInteger ailen) {
        System.out.println(money.divide(ailen) + "\n" + money.remainder(ailen));
    }
}