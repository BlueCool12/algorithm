package lecture.java;

class S2_6_뒤집은_소수 {
    public static void solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i]; // 32

            int reverse = 0;
            while (tmp > 0) {
                reverse = reverse * 10 + (tmp % 10);
                tmp /= 10;
            }

            if (isPrime(reverse)) {
                sb.append(reverse).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
