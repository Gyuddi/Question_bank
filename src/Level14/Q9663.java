package Level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9663 {
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int depth) {
        System.out.println("A");
        for (int i = 0; i < N; i++) {
            if (depth == N) {
                count++;
                return;
            }
            arr[depth] = i;
            if(i!=depth && arr[depth]!=arr[i]&&Math.abs(depth-i)==Math.abs(arr[depth]-arr[i])){
                dfs(depth+1);
            }
        }
    }
}
