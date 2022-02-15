package Level12;

import java.io.*;


public class Q2751 {
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
        for(int a: arr){
            bw.write(a+"\n");
        }
        bw.flush();
        bw.close();
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
