/**
 * 1. 배열을 이용한 문제
 * 2. 6과 9는 Math.ceil()을 사용하여 올림 혹은
 *    Math.max(answer, (plasticNumbers[6] + plasticNumbers[9] + 1) / 2)로 계산
 */

class P1475_방_번호 {
    public static void get(int n) {
        // int[] plasticNumbers = new int[9];
        int[] plasticNumbers = new int[10];

        // int sixOrNine = 0;
        // while (n > 0) {
        //     if (n % 10 == 6 || n % 10 == 9) {
        //         sixOrNine++;
        //     } else {
        //         plasticNumbers[n % 10]++;
        //     }

        //     n /= 10;
        // }
        
        while(n > 0) {
            plasticNumbers[n % 10]++;
            n /= 10;
        }

        // plasticNumbers[6] = (int) Math.ceil(sixOrNine / 2.0);

        int answer = 0;
        // for (int number : plasticNumbers) {
        //     answer = number > answer ? number : answer;
        // }
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) continue;
            answer = Math.max(answer, plasticNumbers[i]);
        }

        answer = Math.max(answer, (plasticNumbers[6] + plasticNumbers[9] + 1) / 2);

        System.out.println(answer);
    }
}
