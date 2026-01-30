package lecture.java;

// import java.util.Stack;

class S2_2_보이는_학생 {
    public static void find(int n, int[] arr) {
        // Stack stack = new Stack<>();

        // stack.push(arr[0]);

        // for (int i = 1; i < n; i++) {
        //     if (Integer.parseInt(stack.peek().toString()) < arr[i]) {
        //         stack.push(arr[i]);
        //     }
        // }        

        // System.out.println(stack.size());

        int answer = 1, max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        System.out.println(answer);
    }
}
