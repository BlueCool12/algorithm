import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. O(N)에 해결하기 위해 단조 감소 스택을 사용
 * 2. 왼쪽에서 오른쪽으로 돌면서 자신보다 작거나 같은 높이는 제거
 * 3. 스택에 남아있는 빌딩들은 자신을 볼 수 있는 빌딩을 뜻함
 */
class P6198_옥상_정원_꾸미기 {
    public static void get(int[] buildings) {
        Deque<Integer> deque = new ArrayDeque<Integer>();                

        Long sum = 0L;
        for (int building : buildings) {            
            while (!deque.isEmpty() && deque.peek() <= building) {                
                deque.pop();
            }
            sum += deque.size();            
            deque.push(building);
        }    
        System.out.println(sum);
    }
}
