/*
 * 1. 롤링 해시(Rolling Hash) 방식
 *    - 문자열을 각 문자마다 r의 거듭제곱을 곱해 정수로 변환하는 해싱 기법
 *    - 수식: H = (a₀ × r⁰ + a₁ × r¹ + a₂ × r² + ... + aₙ₋₁ × rⁿ⁻¹) % mod
 *    - 여기서 aᵢ는 'a'를 1, 'b'를 2, ..., 'z'를 26으로 변환한 값
 *
 * 2. 오버플로우 방지 및 정확한 해시 계산을 위해 mod 연산
 *    - mod 값으로는 큰 소수(1234567891)를 사용하여 값의 범위를 제한하고 충돌을 줄임
 *    - 곱셈 시 (a * b) % m = ((a % m) * (b % m)) % m 성질을 이용해
 *      pow와 hashed 모두 중간중간 mod 연산을 적용해도 최종 결과는 동일함
 */

class P15829_Hashing {
    public static void rolling(String word) {
        long hashed = 0L;
        long r = 31;
        long mod = 1234567891;
        long pow = 1;

        for (int i = 0; i < word.length(); i++) {
            int value = word.charAt(i) - 'a' + 1;
            hashed = (hashed + value * pow) % mod;
            pow = (pow * r) % mod;
        }

        System.out.println(hashed);
    };
}
