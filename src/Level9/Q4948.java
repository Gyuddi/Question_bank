package Level9;

import java.util.Scanner;

public class Q4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int min = sc.nextInt();
            if(min == 0){
                break;
            }
            int max = min*2;
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
            int count = 0;
            for (int a = min+1; a <= max; a++) {
                if (Prime[a] == false) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}

