import java.util.HashSet;
import java.util.Set;

class P11723_집합 {

    private static Set<Integer> set = new HashSet<>();
    private static StringBuilder sb = new StringBuilder();

    public static void calc(String input) {

        String[] splitCommand = input.split(" ");
        String command = splitCommand[0];
        int value = -1;

        if (splitCommand.length > 1) {
            value = Integer.parseInt(splitCommand[1]);
        }

        switch (command) {
            case "add":
                set.add(value);
                break;
            case "remove":
                set.remove(value);
                break;
            case "check":
                if (set.contains(value)) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
                break;
            case "toggle":
                if (set.contains(value)) {
                    set.remove(value);
                } else {
                    set.add(value);
                }
                break;
            case "all":
                set.clear();
                for (int i = 1; i <= 20; i++) {
                    set.add(i);
                }
                break;
            case "empty":
                set.clear();
                break;

            default:
                break;
        }
    }

    public static String getResult() {
        return sb.toString();
    }
}
