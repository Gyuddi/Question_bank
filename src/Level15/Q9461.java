package Level15;

import java.util.Scanner;

public class Q9461 {
    static long[] arr = new long[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            count(a);
            System.out.println(arr[a]);
        }
    }
    public static long count(int num){
        if (arr[num] != 0){
            return arr[num];
        }
        if (num<=3){
            arr[num] = 1;
            return arr[num];
        }
        if (num <= 5){
            arr[num] = 2;
            return arr[num];
        }
        else {
            arr[num] = count(num-1) + count(num-5);
            return arr[num];
        }
    }
}
