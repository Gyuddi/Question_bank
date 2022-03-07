package Level15;

import java.util.Scanner;

public class Q1904 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N+1];
        int answer = count(N);
        System.out.println(answer);
    }
    public static int count(int N){
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= N; i++) {
            arr[i] = (arr[i-1] + arr[i-2])%15746;
        }
        return arr[N];
    }
}
