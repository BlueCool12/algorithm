package lecture.java;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/lecture/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine().strip();
        int[] arr = Stream.of(br.readLine().strip().split(" ")).mapToInt(Integer::parseInt).toArray();
        S2_6_뒤집은_소수.solution(Integer.parseInt(n), arr);
    }
}