// import java.util.HashMap;
// import java.util.Map;
// import java.util.Map.Entry;

/**
 * 1. 알파벳 범위 내이기 때문에 배열을 사용하는게 효율적
 */
class P15238_Pirates {
    public static void get(int length, String word) {

        // Map<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < length; i++) {
        //     char c = word.charAt(i);
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }

        // int max = 0;
        // char answerKey = 'a';
        // for (Entry<Character, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > max) {
        //         answerKey = entry.getKey();
        //         max = entry.getValue();
        //     }
        // }

        // System.out.println(answerKey + " " + max);

        int[] cnt = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            cnt[c - 'a']++;
        }

        int max = 0;
        char answerKey = 'a';

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                answerKey = (char) ('a' + i);
            }
        }

        System.out.println(answerKey + " " + max);
    }
}
