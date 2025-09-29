/**
 * 1. 단순히 최댓값 하나만 찾으면 되기 때문에 Map은 불필요
 * 2. Integer.MIN_VALUE는 자바 int가 가질 수 있는 최솟값 (−2³¹)
 */
class P11557_Yangjojang_of_The_Year {
    public static void top(String[] schools) {  
        // Map<Integer, String> map = new HashMap<>();
        
        // int top = 0;
        // for (String school : schools) {
        //     String[] splited = school.split(" ");            
        //     map.put(Integer.parseInt(splited[1]), splited[0]);
        //     top = Math.max(top, Integer.parseInt(splited[1]));
        // }

        String winner = null;
        int max = Integer.MIN_VALUE;

        for (String line : schools) {
            String[] parts = line.trim().split("\\s+");
            String name = parts[0];
            int drink = Integer.parseInt(parts[1]);

            if (drink > max) {
                max = drink;
                winner = name;
            }
        }

        System.out.println(winner);
    }
}
