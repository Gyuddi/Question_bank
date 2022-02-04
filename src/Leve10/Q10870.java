package Leve10;

import java.util.Scanner;

public class Q10870 {
//    public static int fibo(int a){
//        if(a == 0){
//            return 0;
//        }
//        if (a==1){
//            return 1;
//        }
//        return fibo(a-1)+fibo(a-2);
//    }
    public static int fibo_simple(int a){
        if(a<2){
            return a;
        }
        else {
            int fibo = 0;
            int fibo1 = 1;
            int fibo2 = 0;
            for (int i = 2; i <= a ; i++) {
                fibo = fibo1 + fibo2;
                fibo2 = fibo1;
                fibo1 = fibo;
            }
            return fibo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo_simple(a));
    }
}
