
class P11727_2xn_타일링_2 {
    public static void count(int n) {
        int[] dp = new int[1001];
        
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}