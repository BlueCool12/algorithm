package lecture.java;

class S6_1_선택정렬 {
    public static void solution(int n, int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
