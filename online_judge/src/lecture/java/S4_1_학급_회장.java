package lecture.java;

import java.util.HashMap;

class S4_1_학급_회장 {
    public static void solution(int n, String str) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char vote : str.toCharArray()) {
            map.put(vote, map.getOrDefault(vote, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
