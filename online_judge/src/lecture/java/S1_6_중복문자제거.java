package lecture.java;

// import java.util.HashSet;
// import java.util.Set;

class S1_6_중복문자제거 {
    public static String distinct(String str) {
        StringBuilder sb = new StringBuilder();

        // Set set = new HashSet<>();
        // char[] chars = str.toCharArray();

        // for (char ch : chars) {
        //     if (!set.contains(ch)) {
        //         set.add(ch);
        //         sb.append(ch);
        //     }
        // }

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
