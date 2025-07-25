
class P10250_ACM_호텔 {
    public static void getRoom(int h, int w, int n) {
        int floor = n % h == 0 ? h : n % h;
        int room = (n % h == 0) ? (n / h) : (n / h + 1);
        System.out.printf("%d%02d\n", floor, room);
    }
}
