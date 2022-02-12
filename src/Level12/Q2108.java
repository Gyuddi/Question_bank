package Level12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q2108 {
    private static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sorted = new int [total];
        mergeSort(arr,0,total-1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int avg = (int)getAvg(arr);
        int mid = getMid(arr);
        int mod = getMod(arr);
        int range = getRange(arr);
        bw.write(avg + "\n");
        bw.write(mid + "\n");
        bw.write(mod + "\n");
        bw.write(range + "\n");

        bw.flush();
        bw.close();

    }
    public static int getRange(int[] arr){
        return arr[arr.length-1]-arr[0];
    }
    public static int getMod(int[] arr){
        int[] mod_count = new int[8001];
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            mod_count[arr[i]+4000]++;
        }
        int max = getMax(mod_count);
        for (int j = 0; j < 8001; j++) {
            if(mod_count[j] == max){
                answer.add(j-4000);
            }
        }
        if(answer.size() == 1){
            return answer.get(0);
        }
        else {
            int[] answer_arr = new int[answer.size()];
            for (int i=0; i < answer.size(); i++) {
                answer_arr[i] = answer.get(i).intValue();
            }
            mergeSort(answer_arr,0,answer_arr.length-1);
            return answer_arr[1];
        }
    }
    public static double getAvg(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = Math.round(sum/arr.length);
        return avg;
    }
    public static int getMid(int[] arr){
        int mid;
        if (arr.length % 2 == 0) {
            mid = (arr[arr.length / 2] + arr[arr.length / 2 + 1]) / 2;
        } else {
            mid = arr[arr.length / 2];
        }
        return mid;
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void mergeSort(int[] a, int start, int end){
        if(start == end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(a,start,mid);
        mergeSort(a,mid+1,end);
        int l = start;
        int r = mid+1;
        int idx = start;

        while (l<=mid && r<=end){
            if(a[l] <= a[r]){
                sorted[idx] = a[l];
                idx++;
                l++;
            }
            else {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }
        if(l>mid){
            while (r<=end){
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }
        else {
            while (l<=mid){
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }
        for (int i = start; i <= end ; i++) {
            a[i] = sorted[i];
        }
    }
}
