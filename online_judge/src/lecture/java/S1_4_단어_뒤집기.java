package lecture.java;

class S1_4_단어_뒤집기 {
    public static String reverse(String str) {
        // StringBuilder sb = new StringBuilder();

        // for (int i = str.length() - 1; i >= 0; i--) {
        // sb.append(str.charAt(i));
        // }

        // return sb.toString();

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
