package lecture.java;

class S1_11_문자열_압축 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        // int count = 1;
        // char tmp = 'a';
        // for (char ch : str.toCharArray()) {
        //     if (ch != tmp) {
        //         if (count != 1) {
        //             sb.append(count);
        //         }

        //         sb.append(ch);
        //         tmp = ch;

        //         count = 1;
        //     } else {
        //         count++;
        //     }
        // }        
        
        str = str + " ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
            }
        }    
        
        return sb.toString();
    }
}
