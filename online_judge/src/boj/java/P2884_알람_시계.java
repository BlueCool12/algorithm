class P2884_알람_시계 {
    public static void alarm(int h, int m) {
        if (m - 45 < 0) {
            m = 60 + (m - 45);
            h = h - 1 < 0 ? 23 : h - 1;
        } else {
            m = m - 45;
        }
        System.out.println(h + " " + m);
    }
}
