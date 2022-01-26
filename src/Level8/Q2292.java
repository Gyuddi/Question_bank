package Level8;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 1;
        int n =0;
        if(num == 1){
            System.out.println(1);
        }
        else {
            while(num>x){
                x = x+6*n;
                n++;
            }
            System.out.println(n);
        }
        }

}
