package Level8;

import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fc = sc.nextInt();
        int vc = sc.nextInt();
        int price = sc.nextInt();
        if(vc>=price) {
            System.out.println(-1);
        }
        else {
            System.out.println((long)fc/(price-vc)+1);
        }

    }
}

