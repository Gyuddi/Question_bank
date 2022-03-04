package Level15;

import java.util.Scanner;

public class Q2579 {
    static int[][] arr;
    static int[] cost;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][2];
        cost = new int[N];
        for (int i = 0; i < N; i++) {
            cost[i] = sc.nextInt();
        }
        count();
    }
    public static void count(){
        arr[0][0] = cost[0];
        arr[0][1] = 1;

        for (int i = 2; i < N; i++) {

        }
    }
}
3-15,2
10vs20 = 20
3-35,2