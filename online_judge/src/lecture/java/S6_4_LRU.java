package lecture.java;

class S6_4_LRU {
    public static void solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for (int value : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (value == cache[i]) {
                    pos = i;
                }
            }

            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }                
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }                
            }

            cache[0] = value;
        }

        for (int c : cache) {
            System.out.print(c + " ");
        }
    }
}
