import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/boj/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        P10989_수_정렬하기_3.sort(br, bw);

        bw.flush();
        bw.close();
        br.close();
    }
}