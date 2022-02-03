package Level9;

import java.util.Scanner;

public class Q9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for (int k = 0;k<total;k++) {
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
            for (int b = max / 2; b < max; b++) {
                if (Prime[b] == false && Prime[max - b] == false) {
                    System.out.println(max - b + " " + b);
                    break;
                }
            }
        }
    }
}
