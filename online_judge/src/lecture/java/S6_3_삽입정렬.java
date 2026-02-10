package lecture.java;

class S6_3_삽입정렬 {
    public static void solution(int n, int[] arr) {

        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;

            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }                
            }

            arr[j + 1] = tmp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}