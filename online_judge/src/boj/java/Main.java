import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/boj/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().strip());

        for (int i = 0; i < T; i++) {
            String type = br.readLine().strip().split(" ")[1];
            String test = br.readLine().strip();            
            P12778_CTP공국으로_이민_가자.get(type, test);
        }
    }
}