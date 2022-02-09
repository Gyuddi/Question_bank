package Level11;

import java.util.Scanner;


public class Q7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[][] arr = new int[total][3];
        for (int i = 0; i < total; i++) {
            int[] a = new int[2];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            arr[i] = a;
        }

        for (int j = 0; j < total; j++) {
            int count = 1;
            for (int k = 0; k <total; k++) {
                if(k == j){
                    continue;
                }
                else if(arr[j][0]<arr[k][0] && arr[j][1]<arr[k][1]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
