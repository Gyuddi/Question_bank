package Level8;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("1/1");
            System.exit(0);
        }
        else if (num == 2){
            System.out.println("1/2");
            System.exit(0);
        }
        int count = 1;
        int stage=0;
        for(int i = 1; i<num;i++){
            count+=i;
            if(count>num){
                stage = i+1;
                break;
            }
        }
        int a = stage-(count-num);
        int b = stage - a;

        if(stage%2 ==0){
            System.out.println(String.format("%d/%d",b,a));
        }
        else {
            System.out.println(String.format("%d/%d",a,b));
        }
    }
}
