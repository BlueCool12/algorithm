package lecture.java;

class S1_2_대소문자_변환 {
    public static String transform(String str) {
        String answer = "";        

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                answer += Character.toUpperCase(ch);
            } else {
                answer += Character.toLowerCase(ch);
            }
        }

        return answer;
    }
}
