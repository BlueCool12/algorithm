
class P4388_받아올림 {
    public static void count(int num1, int num2) {
        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2 + carry;

            if (sum >= 10) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        System.out.println(count);
    }
}
