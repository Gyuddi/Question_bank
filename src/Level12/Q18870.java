package Level12;

import java.io.*;
import java.util.*;

public class Q18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        int[] answer =  new int[total];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < total; i++) {
            arr[i] =answer[i] =  Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int rank = 0;

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int key : answer) {
            sb.append(map.get(key)).append(" ");
        }
        System.out.println(sb);

    }
}
