package lecture.java;

class S1_3_문장_속_단어 {
    public static String find(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        
        String[] array = str.split(" ");
        // for (String s : array) {
        //     if (s.length() > answer.length()) {
        //         answer = s;
        //     }
        // }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > m) {
                m = i;
            }
        }

        answer = array[m];
        return answer;
    }
}
