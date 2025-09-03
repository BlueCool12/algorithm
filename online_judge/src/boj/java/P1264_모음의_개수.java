/**
 * 1. 문자열을 toLowerCase() 로 변환하면 조건문 가독성이 좋아짐
 */

class P1264_모음의_개수 {

    public static int get(String line) {
        int sum = 0;

        line.toLowerCase();
        for (char ch : line.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sum++;
            }
        }

        return sum;
    }
}
