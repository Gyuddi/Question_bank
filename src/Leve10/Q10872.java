package Leve10;

import java.util.Scanner;

public class Q10872 {
    public static int fac(int a){

        if(a==0){
            return 1;
        }
        return fac(a-1)*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fac(num));
    }
}
