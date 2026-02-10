package lecture.java;

import java.util.LinkedList;
import java.util.Queue;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

class S5_8_응급실 {
    public static void solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person p : queue) {
                if (p.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    System.out.println(answer);                    
                }
            }
        }        
    }
}