package Level8;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if(num%5 == 0){
            count = num/5;
        }
        else if(num % 5 == 1){
            if(num == 1){
                count = -1;
            }
            else {
                count = (num/5-1) +2;
            }
        }
        else if(num % 5 == 2){
            if(num == 7 || num == 2){
                count = -1;
            }
            else {
                count = (num/5-2)+4;
            }
        }
        else if(num % 5 == 3){
            count = (num/5)+1;
        }
        else if (num % 5 == 4){
            if(num == 4 || num == 8){
                count = -1;
            }
            else {
                count = (num/5-1)+3;
            }
        }
        System.out.println(count);
    }
}
