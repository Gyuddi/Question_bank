package Level9;

import java.util.Scanner;

public class Q1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for (int i = 0; i <total ; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            double dx = x1 - x2;
            double dy = y1-y2;
            double dist = Math.sqrt((dx * dx) + (dy * dy));
            double bigger = Math.max(r1,r2);
            double smaller = Math.min(r1,r2);
            if(x1 == x2 && y1 == y2&&r1 == r2){
                System.out.println(-1);
            }
            else if(dist>(bigger-smaller)){ //한 원의 중심이 다른 원 밖에 있을때.
                if((smaller+bigger)>dist){
                    System.out.println(2);
                }
                else if((smaller+bigger)==dist){
                    System.out.println(1);
                }
                else if((smaller+bigger)<dist) {
                    System.out.println(0);
                }
            }
            else if(dist == (bigger-smaller)){//맞닿았을때
                System.out.println(1);
            }
            else {//안에 있을때
                System.out.println(0);
            }
        }
    }
}
