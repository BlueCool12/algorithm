import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/*
 * 1. 계수 정렬(Counting Sort) 알고리즘
 *    - 숫자의 크기가 한정적일 때 매우 효율적인 정렬 알고리즘
 *    - 비교 기반 정렬이 아닌 입력 값 자체를 인덱스로 사용하여 해당 값이 몇 번 나왔는지를 세는 방식
 */

class P10989_수_정렬하기_3 {
    public static void sort(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < count.length; i++) {
            while (count[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
    }
}