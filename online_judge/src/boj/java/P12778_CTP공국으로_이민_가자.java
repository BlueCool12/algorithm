import java.util.Arrays;

class P12778_CTP공국으로_이민_가자 {
    public static void get(String type, String test) {
        if (type.equals("C")) {
            test = test.replace(" ", "");
            for (char c : test.toCharArray()) {
                System.out.print(c - 64 + " ");
            }
            System.out.println();
        } else {
            int[] numbers = Arrays.stream(test.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int n : numbers) {                
                System.out.print((char) ((char) n + 64) + " ");
            }
            System.out.println();
        }
    }
}
