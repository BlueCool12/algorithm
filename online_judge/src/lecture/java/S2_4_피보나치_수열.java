package lecture.java;

class S2_4_피보나치_수열 {
    public static void solution(int n) {        
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString().trim());

        // int a = 1, b = 1, c;
        // System.out.print(a + " " + b + " ");
        // for (int i = 2; i < n; i++) {
        //     c = a + b;
        //     System.out.print(c + " ");
        //     a = b;
        //     b = c;
        // }
    }
}
