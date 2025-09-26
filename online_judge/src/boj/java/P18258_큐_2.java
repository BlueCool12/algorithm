/**
 * 1. 배열 + 인덱스 기반 큐로 구현
 * 2. String 대신 int로 저장하면 오버헤드 줄일 수 있음
 */

class P18258_큐_2 {
    public static void get(String[] lines) {
        // String[] queue = new String[lines.length];
        int n = lines.length;
        int[] queue = new int[n];

        int head = 0, tail = 0;
        StringBuilder sb = new StringBuilder();

        // for (String line : lines) {
        //     String[] test = line.trim().split(" ");
        //     String command = test[0];
        //     String value = null;
        //     if (command.equals("push")) {
        //         value = test[1];
        //     }

        //     switch (command) {
        //         case "push":
        //             queue[tail++] = value;
        //             break;
        //         case "pop":
        //             String pop = queue[head] != null ? queue[head] : "-1";                    
        //             sb.append(pop + "\n");
        //             if (!pop.equals("-1")) head++;
        //             break;
        //         case "size":                    
        //             sb.append(tail - head + "\n");
        //             break;
        //         case "empty":                    
        //             sb.append((tail - head == 0 ? "1" : "0") + "\n");
        //             break;
        //         case "front":
        //             String front = queue[head] != null ? queue[head] : "-1";                    
        //             sb.append(front + "\n");
        //             break;
        //         case "back":
        //             if (tail != 0 && tail != head) {
        //                 String back = queue[tail - 1] != null ? queue[tail - 1] : "-1";                        
        //                 sb.append(back + "\n");
        //             } else {                        
        //                 sb.append("-1" + "\n");
        //             }
        //             break;
        //     }
        // }

        for (String line : lines) {
            char c0 = line.charAt(0); // 각 명령의 첫 글자로 구분

            if (c0 == 'p') {
                if (line.charAt(1) == 'u') { // push
                    int value = Integer.parseInt(line.substring(5)); // "push "" 이후
                    queue[tail++] = value;
                } else { // pop
                    if (head == tail) sb.append("-1\n");
                    else sb.append(queue[head++]).append('\n');
                }
            } else if (c0 == 's') {
                sb.append(tail - head).append('\n');
            } else if (c0 == 'e') {
                sb.append(head == tail ? 1 : 0).append('\n');
            } else if (c0 == 'f') {
                sb.append(head == tail ? -1 : queue[head]).append('\n');
            } else {
                sb.append(head == tail ? -1 : queue[tail - 1]).append('\n');
            }
        }
        
        System.out.println(sb);
    }
}