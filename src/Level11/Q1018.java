package Level11;

import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        int min = 8*8;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[][] arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            String a = sc.next();
            arr[i] = a.split("");
        }
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                int c = arr_find(arr,i, j);
                if(c<min){
                    min = c;
                }
            }
        }
        System.out.println(min);
    }
    public static  String  change(String start){
        if(start.equals("B")){
            start = "W";
        }
        else {
            start = "B";
        }
        return start;
    }
    public static int arr_find(String[][] arr,int a,int b){
        String start = arr[a][b];
        int count = 0;
        for (int x = a; x < a+8; x++) {
            for (int y = b; y < b+8; y++) {
                if(!arr[x][y].equals(start)){
                    count ++;
                }
                start = change(start);
            }
            start = change(start);
        }
        count = Math.min(count,64-count);
        return count;
    }
}
