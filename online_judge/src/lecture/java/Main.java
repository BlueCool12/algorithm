package lecture.java;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        // 로컬
        String basePath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(basePath + "/online_judge/src/lecture/java/input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().strip().split(" ");

        S7_13_그래프_최단거리.n = Integer.parseInt(line[0]);
        S7_13_그래프_최단거리.m = Integer.parseInt(line[1]);

        S7_13_그래프_최단거리.graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= S7_13_그래프_최단거리.n; i++) {
            S7_13_그래프_최단거리.graph.add(new ArrayList<Integer>());
        }

        S7_13_그래프_최단거리.ch = new int[S7_13_그래프_최단거리.n + 1];
        S7_13_그래프_최단거리.dis = new int[S7_13_그래프_최단거리.n + 1];

        for (int i = 0; i < S7_13_그래프_최단거리.m; i++) {
            String[] ve = br.readLine().strip().split(" ");
            int a = Integer.parseInt(ve[0]);
            int b = Integer.parseInt(ve[1]);

            S7_13_그래프_최단거리.graph.get(a).add(b);
        }

        S7_13_그래프_최단거리.ch[1] = 1;
        S7_13_그래프_최단거리.solution(1);

        for (int i = 1; i <= S7_13_그래프_최단거리.n; i++) {
            if (S7_13_그래프_최단거리.ch[i] == 0) {
                System.out.println(i + " : -1");
            } else {
                System.out.println(i + " : " + S7_13_그래프_최단거리.dis[i]);
            }
        }
    }
}