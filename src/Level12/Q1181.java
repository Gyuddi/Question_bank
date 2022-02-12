package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        String[] arr = new String[total];
        for(int i = 0; i < total; i++) {
            String a = br.readLine();
            arr[i] = a;
        }
        for (int x = 0; x < total-1; x++) {
            int min_idx = x;
            for (int y = x; y < total; y++) {
                if(arr[y].length()<arr[min_idx].length()){
                    min_idx = y;
                }
                else if(arr[y].length() == arr[min_idx].length()){

                    String[] arr_y = arr[y].split("");
                    String[] arr_min = arr[min_idx].split("");
                    for (int i = 0; i < arr_y.length; i++) {
                        if((int)arr_y[i].charAt(0)<(int)arr_min[i].charAt(0)){
                            min_idx = y;
                            break;
                        }
                        else if ((int)arr_y[i].charAt(0)==(int)arr_min[i].charAt(0)){
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                }
            }
            String tmp = arr[x];
            arr[x] = arr[min_idx];
            arr[min_idx] = tmp;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        String[] resultArr = linkedHashSet.toArray(new String[0]);
        for (String a:arr){
            System.out.println(a);
        }
    }
}
// 배열을 싹 아스키코드로 바꿔서 정렬해볼까?.... 내 정렬은 느리니까...
