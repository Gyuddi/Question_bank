package Level8;

import java.util.Scanner;

public class Q2275 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i = 0;i<total;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[b];
            for(int m = 0;m<b;m++){
                arr[m] = m+1;
            }
            int answer = 0;
            for(int k = 0;k<a-1;k++){
                for(int j = 0;j<b;j++){
                    if (j == 0){
                        arr[j] = 1;
                    }
                    else {
                        arr[j] = arr[j-1] + arr[j];
                    }
                }
            }
            for(int num:arr){
                answer += num;
            }
            System.out.println(answer);
        }
    }
}
