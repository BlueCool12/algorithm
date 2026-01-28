package lecture.java;

class S1_1_문자_찾기 {
    public static void find(String str, char c) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        char lowerChar = Character.toLowerCase(c);

        for (char ch : lowerStr.toCharArray()) {
            if (ch == lowerChar)
                count++;
        }

        System.out.println(count);
    }
}
