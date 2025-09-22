/**
 * 1. Math.abs()는 절댓값을 반환
 */

class P1919_애너그램_만들기 {
    public static void get(String firstWord, String secondWord) {
        int[] firstCounts = new int[26];
        int[] secondCounts = new int[26];

        for (char ch : firstWord.toCharArray()) {
            firstCounts[ch - 97]++;
        }

        for (char ch : secondWord.toCharArray()) {
            secondCounts[ch - 97]++;
        }

        int deleteCount = 0;
        for (int i = 0; i < 26; i++) {
            // if (firstCounts[i] != secondCounts[i]) {
            //     deleteCount += firstCounts[i] > secondCounts[i]
            //             ? firstCounts[i] - secondCounts[i]
            //             : secondCounts[i] - firstCounts[i];
            // }
            deleteCount += Math.abs(firstCounts[i] - secondCounts[i]);
        }

        System.out.println(deleteCount);
    }
}
