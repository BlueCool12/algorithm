package lecture.java;

import java.util.HashMap;

class S4_2_아나그램 {
    public static void solution(String str1, String str2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                answer = "NO";
                break;
            }

            map.put(ch, map.get(ch) - 1);
        }

        System.out.println(answer);
    }
}
