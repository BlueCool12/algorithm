package lecture.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/lecture/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine().strip());

        String[] line2 = br.readLine().strip().split(" ");
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(line2[i]);
        }

        S6_6_장난꾸러기.solution(k, arr);
    }
}