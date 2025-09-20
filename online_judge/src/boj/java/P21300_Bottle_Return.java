
class P21300_Bottle_Return {
    public static void refund(int[] bottles) {
        int sum = 0;
        for (int bottle: bottles) {
            sum += 5 * bottle;
        }
        System.out.println(sum);
    }
}
