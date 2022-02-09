package Level11;

import java.util.Scanner;

public class Q1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = sc.nextInt();
        int count = 0;
        int num = 666;
        while(true){
            if(Integer.toString(num).contains("666")){
                count ++;
            }
            if (goal == count){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
