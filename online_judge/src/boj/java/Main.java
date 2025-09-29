import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/boj/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] schools = new String[N];
            for (int j = 0; j < N; j++) {
                schools[j] = br.readLine().trim();
            }
            P11557_Yangjojang_of_The_Year.top(schools);
        }
    }
}