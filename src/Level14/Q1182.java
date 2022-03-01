package Level14;

import java.util.Scanner;

public class Q1182 {
    static int arr[];
    static boolean visited[];
    static int answer;
    static int answer_count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        visited = new boolean[N];
        answer = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 1; j <= N; j++) {
            dfs(0,0,j);
        }

        System.out.println(answer_count);
    }
    public static void dfs(int count,int num,int combi){
        int sum = 0;
        if (count == combi){
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] == true){
                    sum+=arr[i];
                }
            }
            if(sum == answer){
                answer_count+=1;
            }
            return;
        }
        for (int i = num; i < arr.length; i++) {
            visited[i] = true;
            dfs(count+1,i+1,combi);
            visited[i] = false;
        }
    }
}
