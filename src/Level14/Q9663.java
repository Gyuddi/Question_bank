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
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if(possible(depth)){
                dfs(depth+1);
            }
        }
    }
    public static boolean possible(int depth){
        for (int i = 0; i < depth; i++) {
            if(arr[depth]==arr[i]){
                return false;
            }
            else if (Math.abs(depth-i)==Math.abs(arr[depth]-arr[i])){
                return false;
            }
        }
        return true;
    }
}
