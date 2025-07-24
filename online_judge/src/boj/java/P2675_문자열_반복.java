
class P2675_문자열_반복 {
    public static void repeatString(int count, String string) {        
        String answer = "";
        for(int i = 0; i < string.length(); i++) {
            answer += string.split("")[i].repeat(count);
        }        
        System.out.println(answer);
    }
}