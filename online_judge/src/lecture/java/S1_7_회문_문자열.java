package lecture.java;

class S1_7_회문_문자열 {
    public static void isPalindrome(String str) {
        // char[] chars = str.toLowerCase().toCharArray();
        // int lt = 0, rt = chars.length - 1;

        // while (lt < rt) {
        //     if (chars[lt] != chars[rt]) {
        //         System.out.println("NO");
        //         return;
        //     }
        //     lt++;
        //     rt--;
        // }
        
        // for (int i = 0; i < chars.length / 2; i++) {
        //     if (chars[i] != chars[chars.length - 1 - i]) {
        //         System.out.println("NO");
        //         return;
        //     }
        // }

        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }
}
