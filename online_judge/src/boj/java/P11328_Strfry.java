
class P11328_Strfry {
    public static void isRearranged(String original, String rearranged) {
        int[] checked = new int[26];
        for (char ch : original.toCharArray()) {
            checked[ch - 97]++;            
        }

        int[] reChecked = new int[26];
        for (char ch : rearranged.toCharArray()) {
            reChecked[ch - 97]++;
        }

        boolean possible = true;
        for (int i = 0; i < 26; i++) {            
            if (checked[i] != reChecked[i]) {
                possible = false;
                break;
            }
        }

        System.out.println(possible ? "Possible" : "Impossible");
    };
}
