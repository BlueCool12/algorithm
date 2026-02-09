package lecture.java;

import java.util.HashMap;

class S4_4_모든_아나그램_찾기 {
    public static void solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();

        for (char ch : t.toCharArray()) {
            tm.put(ch, tm.getOrDefault(ch, 0) + 1);
        }

        int L = t.length() - 1;
        for (int i = 0; i < L; i++) {
            sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = L; rt < s.length(); rt++) {
            sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0) + 1);
            if (tm.equals(sm)) {
                answer++;
            }

            sm.put(s.charAt(lt), sm.get(s.charAt(lt)) - 1);
            if (sm.get(s.charAt(lt)) == 0) {
                sm.remove(s.charAt(lt));
            }
            lt++;
        }

        System.out.println(answer);
    }
}
