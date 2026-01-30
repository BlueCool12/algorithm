package lecture.java;

class S1_10_가장_짧은_문자거리 {
    public static void get(String s, char t) {
        int[] answer = new int[s.length()];

        int p = 101;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                // answer[i] = answer[i] < p ? answer[i] : p;
                answer[i] = Math.min(answer[i], p);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : answer) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString().strip());
    }
}
