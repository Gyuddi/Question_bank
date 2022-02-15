package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q1181 {
    private static String[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        String[] arr = new String[total];
        sorted = new String[total];
        for(int i = 0; i < total; i++) {
            String a = br.readLine();
            arr[i] = a;
        }
        mergeSort(arr,0, arr.length-1);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(sorted));
        String[] resultArr = linkedHashSet.toArray(new String[0]);
        for (String a:resultArr){
            System.out.println(a);
        }
    }
    public static void mergeSort(String[] a, int start, int end){
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
            if(a[l].length() < a[r].length()){
                sorted[idx] = a[l];
                idx++;
                l++;
            }
            else if (a[l].length() == a[r].length()){
                if(check(a,l,r)==l){
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
    public static int check(String[] a,int l, int r){
        int[] l_arr = new int[a[l].length()];
        int[] r_arr = new int[a[r].length()];
        for (int i = 0; i < a[l].length(); i++) {
            l_arr[i] = (int)a[l].charAt(i);
            r_arr[i] = (int)a[r].charAt(i);
        }
        for (int i = 0; i < a[l].length(); i++) {
            if (l_arr[i]<r_arr[i]){
                return l;
            }
            else if(l_arr[i]==r_arr[i]){
                continue;
            }
            else {
                return r;
            }
        }
        return -1;

    }
}
//아스키 코드로 바꾸기에는 너무 수가 크다.