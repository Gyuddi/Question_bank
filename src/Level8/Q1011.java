package Level8;

import java.util.Scanner;

public class Q1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i = 0;i<total;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            double dis = end - start;
            double sqrt = Math.ceil(Math.sqrt(dis));
            if (dis <= Math.pow(sqrt,2)-sqrt){
                System.out.println((int)(2*sqrt-2));
            }
            else {
                System.out.println((int)(2*sqrt-1));
            }
        }
    }
}
