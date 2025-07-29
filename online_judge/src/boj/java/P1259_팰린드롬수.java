/*
 * 1. StringBuilder는 Java에서 문자열을 효율적으로 다루기 위한 클래스
 * 2. String과 달리 가변객체이기 때문에 문자열 변경 시 메모리 사용이 효율적이고 성능이 빠름
 * 3. reverse()는 문자열을 뒤집는 StringBuilder의 내장 메서드
 */

class P1259_팰린드롬수 {
    public static void get(String number) {
        boolean isPalindrome = true;

        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // if (number.equals(new StringBuilder(number).reverse().toString())) {
        //     System.out.println("yes");
        // } else {
        //     System.out.println("no");
        // }
    }
}
