/*
 * 1. 첫 번째 방식은 조건 분기가 많아 관리가 불편한 대신 조기 종료가 가능
 * 2. 두 번째 방식은 가독성과 안정성이 더 좋아보임
 */

class P2920_음계 {
    public static void getSequence(String[] scale) {
        // if (scale[0].equals("1") || scale[0].equals("8")) {
        // int ionian = scale[0].equals("1") ? 1 : 8;
        // int interval = scale[0].equals("1") ? 1 : -1;

        // for (String degree : scale) {
        // if (Integer.parseInt(degree) == ionian) {
        // ionian += interval;
        // } else {
        // System.out.println("mixed");
        // return;
        // }
        // }
        // System.out.println(ionian == 9 ? "ascending" : "descending");
        // } else {
        // System.out.println("mixed");
        // }

        int[] nums = new int[8];
        for (int i = 0; i < 8; i++) {
            nums[i] = Integer.parseInt(scale[i]);
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 7; i++) {
            if (nums[i] < nums[i + 1]) {
                isDescending = false;
            } else if (nums[i] > nums[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
