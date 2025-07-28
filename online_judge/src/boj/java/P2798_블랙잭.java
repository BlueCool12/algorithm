/*
 * 1. 브루트포스(완전탐색) 문제
 * 2. 모든 경우의 수를 만들기 위해 n - 2까지 반복
 */

class P2798_블랙잭 {
    public static void sumOfThree(int n, int m, int[] cards) {
        int max = 0;
        for (int first = 0; first < n - 2; first++) {
            for (int second = first + 1; second < n - 1; second++) {
                for (int third = second + 1; third < n; third++) {
                    int sum = cards[first] + cards[second] + cards[third];

                    if (sum == m) {
                        System.out.println(m);
                        return;
                    }

                    if (sum > max && sum <= m) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
