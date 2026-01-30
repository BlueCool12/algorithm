package lecture.java;

class S1_8_유효한_팰린드롬 {
    public static void isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
