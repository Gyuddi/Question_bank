package Level11;

import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int answer = a;
        for (int k = 0; k < a; k++) {
            int i = k;
            int num = i;
            while (i>0){
                num+=i%10;
                i = i/10;
            }
            if(num == a && k<answer){
                answer = k;
            }
        }
        if(answer == a){
            System.out.println(0);
        }
        else {
            System.out.println(answer);
        }
    }
}
