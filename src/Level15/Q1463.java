package Level15;

import java.util.Arrays;
import java.util.Scanner;

public class Q1463 {
    static int[] table;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        table = new int[N+1];
        table[1] = 0;
        for (int i = 2; i <= N; i++) {
            table[i] = table[i-1]+1;
            if (i%3 == 0){
                table[i] = Math.min(table[i],table[i/3]+1);

            }
            if (i%2 == 0){
                table[i] = Math.min(table[i],table[i/2]+1);
            }
        }
        System.out.println(table[N]);
    }
}
