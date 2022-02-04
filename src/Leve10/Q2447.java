package Leve10;

import java.util.Arrays;
import java.util.Scanner;

public class Q2447 {
    public static void star(String [][] arr,int x,int y,int N){
        if(N == 1){
            return;
        }
        for(int i = x;i<=x+(N/3);i++){
            for(int j = y;i<=y+(N/3);j++){
                arr[i][j] = " ";
            }
        }
        for(int m = N/3;m<=N;m+=m){
            for(int n = N/3;n<=N;n+=n){
                star(arr,m,n,N/3);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [][] arr = new String[N][N];
        for(int a = 0;a<N;a++){
            Arrays.fill(arr[a],"*");
        }
        star(arr,N/3,N/3,N);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}

