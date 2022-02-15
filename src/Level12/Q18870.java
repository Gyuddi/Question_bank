package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[][] arr = new int[total][2];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < total; i++) {
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = i;
        }
        int[][] arr_x  = arr;
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        ArrayList<Integer> sorted = new ArrayList<>();
        int[] answer  = new int[total];
        int a = 0;
        for (int i = 0; i < total; i++) {
            if (sorted.contains(arr[i][1])){
                a--;
            }
            answer[arr[i][0]] = a;
            sorted.add(arr[i][1]);
            a++;
        }
        for (int x:answer){
            System.out.println(x);
        }
    }
}
