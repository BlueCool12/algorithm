
class P1629_곱셈 {
    public static long pow(long A, long B, long C) {
        if (B == 1) return A % C;

        long half = pow(A, B / 2, C);

        if (B % 2 == 0) {
            return (half * half) % C;
        } else {
            return ((half * half) % C * A) % C;
        }
    }
}
