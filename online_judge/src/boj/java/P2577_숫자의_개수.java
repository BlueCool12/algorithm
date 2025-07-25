/*
 * 1. (result % 10) 1의 자리 구하기
 * 2. (result /= 10) 1의 자리 제거
 */

class P2577_숫자의_개수 {
    public static void getDigitCount(int a, int b, int c) {
        int result = a * b * c;
        int[] digits = new int[10];

        // for (String digitString : result.split("")) {
        //     int digit = Integer.valueOf(digitString);
        //     digits[digit]++;
        // }

        while (result > 0) {
            digits[result % 10]++;
            result /= 10;
        }

        for (int count : digits) {
            System.out.println(count);
        }
    }
}
