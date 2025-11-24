
class P31844_창고지기 {
    public static void count(String line) {

        int robot = 0;
        int box = 0;
        int flag = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '@') {
                robot = i;
            } else if (line.charAt(i) == '#') {
                box = i;
            } else if (line.charAt(i) == '!') {
                flag = i;
            }
        }

        if (robot > box) {
            if (box < flag) {
                System.out.println(-1);
            } else {
                System.out.println(robot - flag - 1);
            }
        } else if (robot < box) {
            if (box > flag) {
                System.out.println(-1);
            } else {
                System.out.println(flag - robot - 1);
            }
        }
    }
}
