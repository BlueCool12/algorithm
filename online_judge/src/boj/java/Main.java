import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/boj/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        
        int[] bottles = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        P21300_Bottle_Return.refund(bottles);
    }
}