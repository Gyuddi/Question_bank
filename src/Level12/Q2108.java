package Level12;

import java.io.*;

public class Q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        radixsort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double avg = getAvg(arr);
        int mid = getMid(arr);
        bw.write(avg + "\n");
        bw.write(mid + "\n");
        bw.flush();
        bw.close();
    }
    public static double getAvg(int[] arr)
    public static double getAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = Math.round(sum/arr.length*10)/10.0;
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

    public static void countSort(int[] data, int exp) {
        int[] output = new int[data.length];
        int[] count = new int[10];

        for (int i = 0; i < data.length; i++) {
            count[(data[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = data.length - 1; i >= 0; i--) {
            output[count[(data[i] / exp % 10)] - 1] = data[i];
            count[(data[i] / exp) % 10]--;
        }

        for (int i = 0; i < data.length; i++) {
            data[i] = output[i];
        }
    }

    public static void radixsort(int[] data) {
        int m = getMax(data);
        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(data, exp);
        }
    }
}
