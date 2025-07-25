/*
 * 1. trim()은 문자열의 앞뒤의 공백 문자를 제거함
 * 2. isEmpty()는 문자열의 길이가 0인지 확인
 * 3. split("\\s+")은 하나 이상의 공백을 기준으로 문자열을 나눔
 *    연속된 공백도 하나의 구분자로 처리
 */

class P1152_단어의_개수 {
    public static void getWordCount(String line) {
        line = line.trim();
        if (line.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(line.split("\\s+").length);
        }        
    }
}
