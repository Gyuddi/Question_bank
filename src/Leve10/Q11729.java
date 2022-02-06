package Leve10;


import java.util.Scanner;

public class Q11729 {
    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int num,int start,int end,int remain){
        if(num == 1){
            sb.append(start+" "+end+"\n");
            return;
        }
        hanoi(num -1,start,remain,end);
        sb.append(start+" "+end+"\n");
        hanoi(num-1,remain,end,start);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((int)Math.pow(2,num)-1);
        hanoi(num,1,3,2);
        System.out.println(sb);
    }
}
