package lecture.java;

import java.util.Stack;

class S5_4_후위식_연산 {
    public static void solution(String str) {
        // Stack<Integer> stack = new Stack<>();

        // for (char ch : str.toCharArray()) {
        //     if (Character.isDigit(ch)) {
        //         stack.push(Character.digit(ch, 10));
        //     } else if (ch == '+') {
        //         int num1 = stack.pop();
        //         int num2 = stack.pop();
        //         stack.push(num1 + num2);
        //     } else if (ch == '-') {
        //         int num2 = stack.pop();
        //         int num1 = stack.pop();
        //         stack.push(num1 - num2);
        //     } else {
        //         int num1 = stack.pop();
        //         int num2 = stack.pop();
        //         stack.push(num1 * num2);
        //     }
        // }

        // System.out.println(stack.pop());

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                
                if (ch == '+') {
                    stack.push(lt + rt);
                } else if (ch == '-') {
                    stack.push(lt - rt);
                } else if (ch == '*') {
                    stack.push(lt * rt);
                } else if (ch == '/') {
                    stack.push(lt / rt);
                }
            }            
        }

        answer = stack.get(0);
        System.out.println(answer);
    }
}
