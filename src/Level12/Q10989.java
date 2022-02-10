package Level12;

import java.io.*;
import java.util.Arrays;

public class Q10989 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        radixsort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int a:arr){
            bw.write(a+"\n");
        }
        bw.flush();
        bw.close();
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void countSort(int[] data, int exp) {
        int[] output = new int[data.length];
        int[] count = new int[10];

        for(int i=0; i<data.length; i++) {
            count[(data[i]/exp)%10]++;
        }

        for(int i=1; i<10; i++) {
            count[i] += count[i-1];
        }

        for(int i=data.length-1; i>=0; i--) {
            output[count[(data[i]/exp%10)]-1] = data[i];
            count[(data[i]/exp)%10]--;
        }

        for(int i=0; i<data.length; i++) {
            data[i] = output[i];
        }
    }
    public static void radixsort(int[] data) {
        int m = getMax(data);
        for(int exp=1; m/exp>0; exp*=10) {
            countSort(data, exp);
        }
    }
}
