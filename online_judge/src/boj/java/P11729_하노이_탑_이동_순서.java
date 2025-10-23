
class P11729_하노이_탑_이동_순서 {

    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void hanoi(int N, int from, int via, int to) {
        if (N == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            return;
        }

        hanoi(N - 1, from, to, via);
        sb.append(from).append(" ").append(to).append("\n");
        count++;
        hanoi(N - 1, via, from, to);
    }
}
