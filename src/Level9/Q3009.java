package Level9;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xarr = new int[3];
        int[] yarr = new int[3];
        for (int i = 0; i < 3; i++) {
            int x_value = sc.nextInt();
            xarr[i] = x_value;
            int y_value = sc.nextInt();
            yarr[i] = y_value;
        }
        int x = 0;
        int y = 0;
        if(xarr[0] == xarr[1]){
            x = xarr[2];
        }
        else if(xarr[1]==xarr[2]){
            x = xarr[0];
        }
        else {
            x = xarr[1];
        }
        if(yarr[0] == yarr[1]){
            y = yarr[2];
        }
        else if(yarr[1]==yarr[2]){
            y = yarr[0];
        }
        else {
            y = yarr[1];
        }
        System.out.println(x+" "+y);
    }
}
