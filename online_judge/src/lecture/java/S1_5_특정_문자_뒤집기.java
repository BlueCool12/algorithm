package lecture.java;

class S1_5_특정_문자_뒤집기 {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();

        int lt = 0;
        int rt = chars.length - 1;

        // while (lt < rt) {
        //     if ((chars[lt] >= 'a' && chars[lt] <= 'z') ||
        //             (chars[lt] >= 'A' && chars[lt] <= 'Z')) {
        //         char tmp = chars[lt];
        //         chars[lt] = chars[rt];
        //         chars[rt] = tmp;
        //     }
        //     lt++;
        //     rt--;
        // }

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(chars);
    }
}
