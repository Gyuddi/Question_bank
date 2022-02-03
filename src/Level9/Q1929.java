package Level9;

import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        boolean[] Prime = new boolean[max + 1];
        Prime[0] = Prime[1] = true;
        for (int i = 2; i < Math.sqrt(Prime.length); i++) {
            if (Prime[i]) {
                continue;
            }
            for (int j = i * i; j < Prime.length; j += i) {
                Prime[j] = true;
            }
        }
        for (int a = min; a <= max; a++) {
            if (Prime[a] == false) {
                System.out.println(a);
            }
        }
    }
}
