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

        int[] boxSize = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] tomatoBox = new int[boxSize[1]][boxSize[0]];

        for (int i = 0; i < boxSize[1]; i++) {
            int[] dot = Arrays.stream(br.readLine().trim().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < boxSize[0]; j++) {
                tomatoBox[i][j] = dot[j];
            }
        }

        P7576_토마토.get(boxSize[0], boxSize[1], tomatoBox);
    }
}