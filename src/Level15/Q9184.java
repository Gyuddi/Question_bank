package Level15;

import java.util.Scanner;

public class Q9184 {
    public static void main(String[] args) {
        int[][][] arr = new int[21][21][21];
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a==0&&b==0&&c==0){
                break;
            }
            w(a,b,c);
        }
    }
    public static int w(int a,int b,int c){
        if (a>20 || b>20 || c>20){
            w(20,20,20);
        }
        if (a<b && b<c){
            return w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }

    }
}


