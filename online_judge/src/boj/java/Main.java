import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/boj/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        

        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("0")) break;

            P1259_팰린드롬수.get(line);
        }        
    }
}