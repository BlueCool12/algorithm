import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/boj/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        

        int N = Integer.parseInt(br.readLine().trim());
        int[] fans = new int[N];
        for (int i = 0; i < N; i++) {
            fans[i] = Integer.parseInt(br.readLine().trim());
        }
        P3015_오아시스_재결합.getPair(fans);
    }
}