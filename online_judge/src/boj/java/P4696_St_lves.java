/**
 * 1. 매번 Math.pow()로 연산하는 것보다 반복문을 돌리면서 더하는게 효율적
 */
class P4696_St_lves {
    public static void get(double value) {
        // double man = 1.0;
        // double wives = value;
        // double sack = Math.pow(value, 2.0);        
        // double cats = Math.pow(value, 3.0);
        // double kits = Math.pow(value, 4.0);

        // double total = man + wives + sack + cats + kits;

        double total = 1.0;
        double term = 1.0;

        for (int i = 0; i < 4; i++) {
            term *= value;
            total += term;
        }

        System.out.printf("%.2f\n", total);
    }
}
