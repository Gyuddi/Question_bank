package Level11;

import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int gap = M;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for(int j = i+1;j<N;j++){
                for(int k = j+1;k<N;k++){
                    int a = arr[i]+arr[j]+arr[k];
                    if(M-a<gap){
                        if(M-a < 0){
                            continue;
                        }
                        gap = M-a;
                        answer = a;

                    }
                }
            }
        }
        System.out.println(answer);
    }
}
