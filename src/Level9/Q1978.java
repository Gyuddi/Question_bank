package Level9;

import java.util.Arrays;
import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int [] total_arr = new int[total];
        for (int i = 0;i<total;i++){
            int num = sc.nextInt();
            total_arr[i] = num;
        }
        Arrays.sort(total_arr);
        int max = total_arr[total-1];
        boolean[] Prime = new boolean[max+1];
        Prime[1] = true;
        for(int j = 2;j<max;j++){
            for(int k = 2;k*j<=max;k++){
                Prime[j*k] = true;
            }
        }
        int count = 0;
        for (int a:total_arr){
            if(Prime[a] == false){
                count ++;
            }
        }
        System.out.println(count);
    }
}
