package Level12;

import java.io.*;
import java.util.StringTokenizer;

public class Q11651 {
    private static int[][] sorted;
    public static void mergeSort_y(int[][] a, int start, int end){
        if(start == end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort_y(a,start,mid);
        mergeSort_y(a,mid+1,end);
        int l = start;
        int r = mid+1;
        int idx = start;

        while (l<=mid && r<=end){
            if(a[l][1] <= a[r][1]){
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
    public static void mergeSort_x(int[][] a, int start, int end){
        if(start == end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort_x(a,start,mid);
        mergeSort_x(a,mid+1,end);
        int l = start;
        int r = mid+1;
        int idx = start;

        while (l<=mid && r<=end){
            if(a[l][0] <= a[r][0]){
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        int[][] arr = new int[total][2];
        sorted = new int[total][2];

        StringTokenizer st;
        for(int i = 0; i < total; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        mergeSort_x(arr,0,total-1);
        mergeSort_y(arr,0,total-1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int[] q:arr) {
            for (int p:q){
                bw.write(String.valueOf(p));
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
