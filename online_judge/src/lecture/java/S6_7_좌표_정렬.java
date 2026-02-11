package lecture.java;

import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

class S6_7_좌표_정렬 {
    public static void solution(int[][] arr) {

        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {

        //         if (arr[j][0] < arr[i][0]) {
        //             int[] tmp = { arr[i][0], arr[i][1] };
        //             arr[i] = arr[j];
        //             arr[j] = tmp;
        //         } else if (arr[j][0] == arr[i][0]) {
        //             if (arr[j][1] < arr[i][1]) {
        //                 int[] tmp = { arr[i][0], arr[i][1] };
        //                 arr[i] = arr[j];
        //                 arr[j] = tmp;
        //             }
        //         }
        //     }
        // }

        // for (int[] values : arr) {
        //     System.out.println(values[0] + " " + values[1]);
        // }

        ArrayList<Point> list = new ArrayList<>();
        
        for (int[] nums : arr) {
            list.add(new Point(nums[0], nums[1]));
        }

        Collections.sort(list);
        for (Point p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
