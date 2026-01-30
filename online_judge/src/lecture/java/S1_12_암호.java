package lecture.java;

// import java.util.ArrayList;
// import java.util.List;

class S1_12_암호 {
    public static String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();
        // List<String> list = new ArrayList<>();

        // for (int i = 0; i < str.length(); i += 7) {
        //     String tmp = str.substring(i, i + 7);
        //     list.add(tmp);
        // }

        // for (String secret : list) {
        //     secret = secret.replace('#', '1');
        //     secret = secret.replace('*', '0');
        //     int code = Integer.parseInt(secret, 2);
        //     sb.append(Character.toChars(code));
        // }

        for (int i = 0; i < n; i++) {
            String tmp = str
                    .substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');

            int num = Integer.parseInt(tmp, 2);
            sb.append((char) num);

            str = str.substring(7);
        }

        return sb.toString();
    }
}
