package Level9;

import java.util.Scanner;

public class Q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int w_x = w-x;
        int h_y = h-y;
        if(x>w_x){
            x = w_x;
        }
        if(y>h_y){
            y = h_y;
        }
        if(x<y){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }

    }
}