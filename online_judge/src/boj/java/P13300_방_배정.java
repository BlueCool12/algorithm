/**
 * 1. 남자, 여자를 구분하는 두개의 배열을 통해 풀이
 * 2. (m + K - 1) / K 연산은 Math.ceil()과 동일한 올림 처리
 */

class P13300_방_배정 {
    public static void get(String[] students, int K) {
        int[] man = new int[7];
        int[] woman = new int[7];

        for (String s : students) {
            String[] info = s.split(" ");
            if (Integer.parseInt(info[0]) == 0) {
                woman[Integer.parseInt(info[1])]++;
            } else {
                man[Integer.parseInt(info[1])]++;
            }
        }

        int sum = 0;
        for (int m : man) {
            sum += (m + K - 1) / K;
        }

        for (int w : woman) {
            sum += (w + K - 1) / K;
        }

        System.out.println(sum);
    }
}
