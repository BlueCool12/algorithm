
class P15780_멀티탭_충분하니 {
    public static void calc(int[] init, int[] test) {
        int n = init[0];
        int k = init[1];

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += (int) Math.ceil(test[i] / 2.0);
        }

        System.out.println(sum >= n ? "YES" : "NO");
    }
}
