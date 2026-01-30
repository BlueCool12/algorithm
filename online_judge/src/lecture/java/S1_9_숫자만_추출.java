package lecture.java;

class S1_9_숫자만_추출 {
    public static int get(String str) {
        // String tmp = str.replaceAll("[^0-9]", "");
        // return Integer.valueOf(tmp);

        // int answer = 0;
        // for (char ch : str.toCharArray()) {
        //     if (ch >= 48 && ch <= 57) {
        //         answer = answer * 10 + (ch - 48);
        //     }
        // }

        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
