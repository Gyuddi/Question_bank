package Level12;

import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x = 0; x < total-1; x++) {
            int min_idx = x;
            for (int y = x; y < total; y++) {
                if(arr[y]<arr[min_idx]){
                    min_idx = y;
                }
            }
            int tmp = arr[x];
            arr[x] = arr[min_idx];
            arr[min_idx] = tmp;
        }
        for (int a:arr){
            System.out.println(a);
        }
    }
}
