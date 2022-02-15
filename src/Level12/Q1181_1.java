package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        String[] arr = new String[total];
        for (int i = 0; i < total; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    // compareTo 매서드는 기준값에 비교대상이 순서에 맞게 포함되어있을 경우
                    //서로의 문자열 길이의 차이값을 리턴해준다.
                    //아닌 경우 그 시점 이후의 값들의 아스키코드 값 차이를 리턴한다...
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });
        for (int i = 0; i < total-1; i++) {
            if (arr[i].equals(arr[i + 1])){
                continue;
            }
            else System.out.println(arr[i]);
        }
        System.out.println(arr[total-1]);
    }
}