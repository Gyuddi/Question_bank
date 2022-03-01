package Level14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q6603 {
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static final int MAX = 6;
    static int[] answer = new int[6];
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if(k == 0) {
                System.out.println(sb.toString());
                return;
            }
            arr = new int[k];
            for(int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            visited = new boolean[arr.length];
            dfs(arr,0,0);
            System.out.println("");
        }
    }

    public static void dfs(int[] arr,int count,int n) {


        if (count == 6) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]){
                    sb.append(arr[i]).append(' ');
                }
            }
            sb.append('\n');
            System.out.print(sb);
            return;
        }
        for (int i = n; i < arr.length; i++) {
                visited[i] = true;
                dfs(arr,count+1,i+1);
                visited[i] = false;
        }
    }
}
