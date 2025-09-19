
class P28074_모비스 {
    public static void isGenerate(String word) {
        int[] mobis = { 1, 1, 1, 1, 1 };

        for (char ch : word.toCharArray()) {
            if (ch == 'M') {
                mobis[0] = 0;
            } else if (ch == 'O') {
                mobis[1] = 0;
            } else if (ch == 'B') {
                mobis[2] = 0;
            } else if (ch == 'I') {
                mobis[3] = 0;
            } else if (ch == 'S') {
                mobis[4] = 0;
            }
        }

        boolean isMobis = true;
        for (int i : mobis) {
            if (i == 1) {
                isMobis = false;
                break;
            }
        }

        if (isMobis) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
