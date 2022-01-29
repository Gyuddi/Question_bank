package Level8;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for (int i = 0;i< total;i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int a = (N-1)%H;
            int b = N/H;
            if (N%H == 0){
                System.out.println((a+1)*100+b);
            }
            else {
                System.out.println((a+1)*100+b+1);
            }
        }
    }
}
