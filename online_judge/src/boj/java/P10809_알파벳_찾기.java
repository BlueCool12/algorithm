
class P10809_알파벳_찾기 {
    public static void get(String word) {
        int[] count = new int[26];

        for (int i = 0; i < count.length; i++) {
            count[i] = -1;
        }
        
        for (int i = 0; i < word.length(); i++) {
            if (count[word.charAt(i) - 97] == -1) {
                count[word.charAt(i) - 97] = i;
            }
        }

        for (int num : count) {
            System.out.println(num);
        }
    }
}
