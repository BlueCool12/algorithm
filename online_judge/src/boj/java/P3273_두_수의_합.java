/**
 * 1. numbers와 x의 범위가 정해져있기 때문에 배열로 풀이
 * 2. O(n)으로 반복문을 한번만 돌면서 checked에 나온 수들을 표시
 */

class P3273_두_수의_합 {
    public static void get(int n, int[] numbers, int x) {
        boolean[] checked = new boolean[2000001];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x > numbers[i] && checked[x - numbers[i]]) {
                count++;
            }
            checked[numbers[i]] = true;
        }

        System.out.println(count);
    }
}
