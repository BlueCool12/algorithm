package lecture.java;

class S2_3_가위바위보 {
    public static void solution(int n, int[] a, int[] b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                sb.append("D").append("\n");
            } else if (a[i] == 1 && b[i] == 3) {
                sb.append("A").append("\n");
            } else if (a[i] == 2 && b[i] == 1) {
                sb.append("A").append("\n");
            } else if (a[i] == 3 && b[i] == 2) {
                sb.append("A").append("\n");
            } else {
                sb.append("B").append("\n");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
