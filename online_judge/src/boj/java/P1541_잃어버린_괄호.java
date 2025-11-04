import java.util.Arrays;

class P1541_잃어버린_괄호 {
    public static void calc(String line) {
        String[] terms = line.split("-");

        int answer = 0;
        for (int i = 0; i < terms.length; i++) {
            if (i == 0) {
                answer = sum(terms[i]);
            } else {
                answer -= sum(terms[i]);
            }
        }

        System.out.println(answer);
    }

    private static int sum(String plusTerms) {
                
        if (plusTerms.contains("+")) {
            return Arrays.stream(plusTerms.split("\\+"))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }

        return Integer.parseInt(plusTerms);
    }
}
