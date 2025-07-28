/*
 * 1. 1 + 6 x (1 + 2 + 3 + ... + n)
 */

class P2292_벌집 {
    public static void count(int n) {
        // if (n <= 1) {
        //     System.out.println("1");
        //     return;
        // }

        // int polygon = 6;
        // int beehive = 1;

        // for (int i = 1; beehive < n; i++) {
        //     beehive += (polygon * i);
        //     System.out.println(i + 1);
        // }

        int level = 1; // 시작 레벨 (1번 방)

        int rangeEnd = 1; // 해당 level의 마지막 방 번호

        while (n > rangeEnd) {
            rangeEnd += 6 * level;
            level++;
        }

        System.out.println(level);
    }
}
