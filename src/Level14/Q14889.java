package Level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14889 {
    static int N;
    static int[][] map;
    static  boolean[] visit;
    static int Min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visit = new boolean[N];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(Min);

    }
    public static void dfs(int idx,int count){
        if(count == N/2){
            gap();
            return;
        }
        for (int i = idx; i < N; i++) {
            if (visit[i]==false){
                visit[i] = true;
                dfs(i+1,count+1);
                visit[i] = false;
            }
        }

    }
    public static void gap(){
        int a_sum = 0;
        int b_sum = 0;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (visit[i]==true&&visit[j]==true){
                    a_sum+= map[i][j];
                    a_sum+= map[j][i];
                }
                else if (visit[i]==false&&visit[j]==false){
                    b_sum+=map[i][j];
                    b_sum+= map[j][i];
                }
            }
        }
        int val = Math.abs(a_sum-b_sum);
        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val, Min);
    }
}
