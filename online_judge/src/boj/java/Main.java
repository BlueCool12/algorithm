import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/boj/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().strip());        
        P11729_하노이_탑_이동_순서.hanoi(N, 1, 2, 3);
        System.out.println(P11729_하노이_탑_이동_순서.count);
        System.out.println(P11729_하노이_탑_이동_순서.sb.toString());
    }
}